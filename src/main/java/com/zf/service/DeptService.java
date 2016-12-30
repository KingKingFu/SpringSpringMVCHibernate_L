package com.zf.service;

import com.zf.entity.Dept;

import java.util.List;

/**
 * Created by lanling on 2016/12/28.
 */
public interface DeptService {
    Dept findDeptById(Integer id);

    List<Dept> findAll();

    boolean addDept(Dept dept);
}
