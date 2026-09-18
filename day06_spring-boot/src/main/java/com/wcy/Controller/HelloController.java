package com.wcy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 标明这个类是来处理请求的
@Controller
public class HelloController {

    // 声明接口
    // 接收/hello路由请求
    @RequestMapping(path = "/hello")
    // 直接将字符串装到响应体中
    @ResponseBody
    public String hello(String name) {
        return "欢迎来到小汪的世界   " + name;
    }
}
