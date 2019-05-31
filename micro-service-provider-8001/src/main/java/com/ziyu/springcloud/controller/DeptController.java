package com.ziyu.springcloud.controller;

import com.ziyu.springcloud.Entity.DeptEntity;
import com.ziyu.springcloud.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody DeptEntity deptEntity) {

        return   deptService.addDept(deptEntity);
    }
    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public DeptEntity findById(@PathVariable("deptNo") Long deptNo) {
        System.err.println("测试id:"+deptNo);
        System.err.println("测试结果:"+deptService.findById(deptNo));
        return  deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<DeptEntity> findAll() {

        System.err.println(111);
        return deptService.findAll();
    }

    /**
     * 增加自己服务描述的接口
     * @return
     */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有多少个微服务:"+list.size());

        //查询STUDY-SPRINGCLOUD-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("ZIYU-SPRINGCLOUD-DEPT");

        //打印STUDY-SPRINGCLOUD-DEPT服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }

}