package com.wcy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    员工的对象类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    // 定义数据模型
    private Integer id;
    private String name;
    private String image;
    private Integer gender;
    private Integer job;
    private String entryDate;
    private String updateTime;
    
}
