package com.dong.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author dongwq  通过配置类生成对象
 * 注解特点如下:
 *      @Configuration的注解类标识这个类可以使用Spring IoC容器作为bean定义的来源
 *      @Bean注解告诉Spring，一个带有@Bean的注解方法将返回一个对象，该对象应该被注册为在Spring应用程序上下文中的bean
 * 注解描述如下:
 * @Bean注解相比@Configuration注解使用更加灵活,
 *     1：当我们引用第三方库中的类需要装配到Spring容器时，则只能通过@Bean来实现
 *     2：根据状态值返回不同的对象，示例如下示例所操作。此功能@Configuration等@service注解则无法实现此功能。
 *
 */
@Configuration
public class BeanConfiguration {

    @Autowired
    private Status status;

    /**
     * 创建的bean对象的beanid默认为方法名
     *
     * @return
     */
    @Bean
    public UserDemo userDemo() {
        System.out.println("UserDemo bean configuration test No args start");
        return new UserDemo();
    }

    /**
     * 创建的bean对象的beanid默认为方法名
     *
     * @return
     * @description 根据状态值返回不同的初始化对象
     */
    @Bean
    public User userDemoImpl(Status status) {
        System.out.println("UserDemo bean configuration test have args start");
        System.out.println("获取Status类的maxValue字段值为:" + status.getMaxValue());
        switch (status.getMaxValue()) {
            case 100:
                return new UserDemo();
            case 200:
                return new UserDemo1();
            case 300:
                return new UserDemo2();
            default:
                return null;
        }
    }
}

/**
 * 抽象接口
 */
interface User {

}

@Data
@AllArgsConstructor
class UserDemo implements User {

    public UserDemo() {
        System.out.println("UserDemo has loaded");
    }

    private String name;

    private Integer age;

}

@Data
@AllArgsConstructor
class UserDemo1 implements User {

    public UserDemo1() {
        System.out.println("UserDemo1 has loaded");
    }

    private String name;

    private Integer age;
}

@Data
@AllArgsConstructor
class UserDemo2 implements User {

    public UserDemo2() {
        System.out.println("UserDemo2 has loaded");
    }


    private String name;

    private Integer age;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
class Status {

    private String status;
    /**
     * 初始化一个值
     */
    private Integer maxValue = 100;
}
