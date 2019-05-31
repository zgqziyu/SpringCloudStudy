package com.ziyu.springcloud.service;

import com.ziyu.springcloud.Entity.DeptEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "ZIYU-SPRINGCLOUD-DEPT")
public interface DeptClientService
{
    @RequestMapping(value = "/dept/findById/{id}", method = RequestMethod.GET)
    public DeptEntity get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<DeptEntity> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(DeptEntity dept);
}