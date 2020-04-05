package com.dong;

import lombok.extern.java.Log;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Log
@MapperScan("com.dong")
@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        log.info("打印日志开始!!!");
        SpringApplication.run(AppStart.class, args);
    }

}
