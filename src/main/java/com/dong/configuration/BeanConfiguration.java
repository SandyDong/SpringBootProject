package com.dong.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongwq  通过配置类生成对象
 * @Configuration的注解类标识这个类可以使用Spring IoC容器作为bean定义的来源
 * @Bean注解告诉Spring，一个带有@Bean的注解方法将返回一个对象，该对象应该被注册为在Spring应用程序上下文中的bean
 */
@Configuration
public class BeanConfiguration {

    /**
     * 创建的bean对象的beanid默认为方法名
     * @return
     */
   @Bean
   public  UserDemo  userDemo(){
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
