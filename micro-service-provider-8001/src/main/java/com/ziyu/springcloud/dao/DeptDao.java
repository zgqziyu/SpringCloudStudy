package com.ziyu.springcloud.dao;

import com.ziyu.springcloud.Entity.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


//@Component
@Mapper
public interface DeptDao {

    /**
     * 插入
     * @param deptEntity
     *
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<DeptEntity> findAll();

}