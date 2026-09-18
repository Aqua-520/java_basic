package com.wcy.service.impl;

import com.wcy.dao.EmpDao;
import com.wcy.dao.impl.EmpDaoImpl;
import com.wcy.entity.Emp;
import com.wcy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao = new EmpDaoImpl();

    // 查询员工信息的实现类
    // 重写方法
    @Override
    public List<Emp> listEmps(String name, Integer gender, Integer job) {
        // 调用数据层拿到数据
        List<String> lines = empDao.readLines();

        // 如果没有数据直接返回空
        if (lines == null || lines.size() == 0) {
            return List.of();
        }
        // 解析数据,将字符串切割成员工对象
        Stream<Emp> stream = lines.stream()
                .map(line -> {
                    // 解析文件数据
                    String[] strs = line.split(",");
                    Integer empId = Integer.valueOf(strs[0]);
                    String empName = strs[1];
                    String empImage = strs[2];
                    Integer empGender = Integer.valueOf(strs[3]);
                    Integer empJob = Integer.valueOf(strs[4]);
                    String empEntryDate = strs[5];
                    String empUpdateTime = strs[6];
                    // 创建员工对象
                    return new Emp(empId, empName, empImage, empGender, empJob, empEntryDate, empUpdateTime);
                });
        // 姓名过滤
        if (name != null && name.length() > 0) {
            stream = stream.filter(emp -> emp.getName().contains(name));
        }
        // 性别过滤
        if (gender != null) {
            stream = stream.filter(emp -> emp.getGender() == gender);
        }
        // 职位过滤
        if (job != null) {
            stream = stream.filter(emp -> emp.getJob() == job);
        }

        // 2. 进行业务处理
        return stream.toList();
    }
}
