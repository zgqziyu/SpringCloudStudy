package com.ziyu.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ziyu.springcloud.Entity.DeptEntity;
import com.ziyu.springcloud.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/findById/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public DeptEntity get(@PathVariable("id") Long id)
    {
        DeptEntity dept = this.service.findById(id);

        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return dept;
    }

    public DeptEntity processHystrix_Get(@PathVariable("id") Long id)
    {
        return new DeptEntity().setId(id).setDeptName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDbSource("no this database in MySQL");
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<DeptEntity> findAll() {

        return service.findAll();
    }

}