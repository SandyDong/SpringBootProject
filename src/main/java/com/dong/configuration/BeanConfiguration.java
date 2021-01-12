package com.dong.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongwq  通过配置类生成对象
 */
@Configuration
public class BeanConfiguration {

   @Bean
   public  UserDemo  generateUser(){
       System.out.println("bean configuration start");
       return new UserDemo();
   }
}

class UserDemo {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
