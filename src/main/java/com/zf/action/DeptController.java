package com.zf.action;

import com.zf.entity.Dept;
import com.zf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept/add")
    public String add(Dept dept) {
        boolean res = deptService.addDept(dept);
        if (res)
            return "/dept/find.do";
        else
            return "/index.jsp";
    }

    @RequestMapping("/dept/find")
    public String find(Model model) {
        model.addAttribute("depts", deptService.findAll());
        return "/deptShow.jsp";
    }
}
