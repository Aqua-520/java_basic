package com.wcy.dao;

import java.util.List;

public interface EmpDao {
    /**
     * 读取数据文件
     *
     * @return
     */
    List<String> readLines();

}
