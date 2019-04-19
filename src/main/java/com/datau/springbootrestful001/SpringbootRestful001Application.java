package com.datau.springbootrestful001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot启动类
 */
@SpringBootApplication
//mapper接口类扫描包配置
@MapperScan("com.datau.springbootrestful001.dao")
public class SpringbootRestful001Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRestful001Application.class, args);
    }

}
