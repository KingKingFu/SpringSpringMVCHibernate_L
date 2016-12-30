package com.zf.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EntityTest {

    @Test
    public void fun() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");

//        DeptService deptService = act.getBean(DeptService.class);
//
//        for (Dept dept : deptService.findAll()) {
//            System.out.println(dept);
//        }
    }
}