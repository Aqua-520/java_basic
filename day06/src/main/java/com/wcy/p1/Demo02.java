package com.wcy.p1;

import cn.hutool.core.io.FileUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo02 {

    public static void main(String[] args) {

        // 使用Hutool工具包完成文件拷贝功能
        // 单文件拷贝
        copySingleFile();
        // 文件夹拷贝
        // copyDirectory();

    }

    /**
     * 单文件拷贝（最常用）
     * FileUtil.copy 核心API，一行代码实现
     */
    private static void copySingleFile() {
        try {
            // 源文件路径（替换为自己的文件路径）
            String srcFile = Paths.get("C:\\Users\\84370\\Desktop\\e464f718.gif").toString();
            // 目标文件路径（拷贝后存放位置）
            String destFile = Paths.get("C:\\Users\\84370\\Desktop\\copy_e464f718.gif").toString();

            // 核心API：拷贝文件，第三个参数为true表示覆盖目标文件
            FileUtil.copy(srcFile, destFile, true);
            System.out.println("单文件拷贝成功");
        } catch (Exception e) {
            System.err.println("单文件拷贝失败：" + e.getMessage());
        }
    }

    /**
     * 文件夹拷贝（递归拷贝子文件/子文件夹）
     * FileUtil.copyDir 核心API，一行代码实现
     */
    private static void copyDirectory() {
        try {
            // 源文件夹路径（替换为自己的文件夹路径）
            Path srcDir = Paths.get("F:\\aaa");
            // 目标文件夹路径（拷贝后存放位置）
            Path destDir = Paths.get("F:\\mjj");

            // 核心API：递归拷贝整个文件夹，默认覆盖已存在文件
            FileUtil.copy(srcDir, destDir);
            System.out.println("文件夹拷贝成功");
        } catch (Exception e) {
            System.err.println("文件夹拷贝失败：" + e.getMessage());
        }
    }
}