package com.ziyu.springcloud.controller;

import com.ziyu.springcloud.Entity.DeptEntity;
import com.ziyu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    DeptClientService service;

    @RequestMapping(value = "/consumer/dept/getfindById/{id}")
    public DeptEntity get(@PathVariable("id") Long id) {

        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<DeptEntity> list() {

        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(DeptEntity dept) {
        return this.service.add(dept);
    }
}