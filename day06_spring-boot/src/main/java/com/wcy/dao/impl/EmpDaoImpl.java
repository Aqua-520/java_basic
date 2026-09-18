package com.wcy.dao.impl;

import com.wcy.dao.EmpDao;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Component
public class EmpDaoImpl implements EmpDao {

    @Override
    public List<String> readLines() {
        try {
            // 加载resource目录下的文件
            File file = ResourceUtils.getFile("classpath:emp.txt");
            // 读取文件中的所有行数据
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
