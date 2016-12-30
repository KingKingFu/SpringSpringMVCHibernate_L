package com.zf.dao;

import com.zf.entity.Dept;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lanling on 2016/12/28.
 */
public interface DeptDao {
    List<Dept> selectAll();

    Dept selectById(Integer id);

    Serializable insert(Dept dept);
}
