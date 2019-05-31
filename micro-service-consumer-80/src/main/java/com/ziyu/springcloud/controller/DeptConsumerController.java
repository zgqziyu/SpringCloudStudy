package com.ziyu.springcloud.controller;

import com.ziyu.springcloud.Entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
//    private  static  final  String PREFIX="http://localhost:8001";
    private  static  final  String PREFIX="http://ZIYU-SPRINGCLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(DeptEntity deptEntity){
        return restTemplate.postForObject(PREFIX +"/dept/add",deptEntity,Boolean.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping("/consumer/getDepts")
    public List<DeptEntity> getDepts(){

        return restTemplate.getForObject(PREFIX+"/dept/list",List.class);
    }

    @RequestMapping("/consumer/getDept/{id}")
    public DeptEntity getDeptById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PREFIX+"/dept/findById/"+id,DeptEntity.class);
    }

    @RequestMapping(value = "/consumer/cons/dic")
    public Object discovery(){

        return restTemplate.getForObject(PREFIX+"/dept/disc",Object.class);
    }
}