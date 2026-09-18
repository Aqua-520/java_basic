package com.wcy.Controller;

import com.wcy.entity.Emp;
import com.wcy.service.EmpService;
import com.wcy.service.impl.EmpServiceImpl;
import lombok.Locked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {
    // new业务层对象
    @Autowired
    private EmpService empService;

    // 定义接口
    @GetMapping("/emps/list") // 请求路径
    @ResponseBody // 将字符串转json返回给前端
    public List<Emp> getEmpList(String name, Integer gender, Integer job) {
        // 调用业务层拿到遍历好的员工list
        List<Emp> empList = empService.listEmps(name, gender, job);
        return empList;
    }
}
