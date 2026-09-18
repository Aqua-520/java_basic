package com.wcy.service;

import com.wcy.entity.Emp;

import java.util.List;

public interface EmpService {
    /**
     * 实现查询员工信息列表的接口
     *
     * @param name
     * @param gender
     * @param job
     * @return
     */
    List<Emp> listEmps(String name, Integer gender, Integer job);
}
