package com.dong;

import lombok.extern.java.Log;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * @SpringBootApplication 注解 包含@ComponentScan注解
 * 我们可以通过basePackages等属性来细粒度的定制@ComponentScan自动扫描的范围，
 * 如果不指定，则默认Spring框架实现会从声明@ComponentScan所在类的package进行扫描。
 *
 * 注：所以SpringBoot的启动类最好是放在root package下，因为默认不指定basePackages。
 *
 */

@Log
@MapperScan("com.dong")
//@SpringBootApplication(scanBasePackages = "com.dong")
@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        log.info("打印日志开始!!!");
        SpringApplication.run(AppStart.class, args);

        //获取获取spring IOC对象

    }

}
