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
 *
 * 注释：@SpringBootApplication注解包含@EnableAutoConfiguration注解
 * @EnableScheduling、@EnableCaching、@EnableMBeanExport等，@EnableAutoConfiguration的理念和做事方式其实一脉相承，简单概括一下就是，借助@Import的支持，收集和注册特定场景相关的bean定义。
 *
 *  @EnableScheduling是通过@Import将Spring调度框架相关的bean定义都加载到IoC容器。
 *  @EnableMBeanExport是通过@Import将JMX相关的bean定义加载到IoC容器。
 *
 *  而@EnableAutoConfiguration也是借助@Import的帮助，将所有符合自动配置条件的bean定义加载到IoC容器，仅此而已！
 *
 *  @EnableAutoConfiguration会根据类路径中的jar依赖为项目进行自动配置，如：添加了spring-boot-starter-web依赖，会自动添加Tomcat和Spring MVC的依赖，Spring Boot会对Tomcat和Spring MVC进行自动配置。
 *
 *
 *
 * @EnableAutoConfiguration 注解内容如下：
 *
 *      @Target({ElementType.TYPE})
 *      @Retention(RetentionPolicy.RUNTIME)
 *      @Documented
 *      @Inherited
 *      @AutoConfigurationPackage
 *      @Import({AutoConfigurationImportSelector.class})
 *
 *      AutoConfigurationImportSelector.class 最为重要
 *
 *      借助AutoConfigurationImportSelector，@EnableAutoConfiguration可以帮助SpringBoot应用将所有符合条件的@Configuration配置都加载到当前SpringBoot创建并使用的IoC容器。
 *
 *      借助于Spring框架原有的一个工具类：SpringFactoriesLoader的支持，@EnableAutoConfiguration可以智能的自动配置功效才得以大功告成！
 *
 *      AutoConfigurationImportSelector里调用 SpringFactoriesLoader的示例代码如下：
 *
 *             通过AutoConfigurationImportSelector类的selectImports()方法,该方法中会调用如下示例的方法
 *
 *         protected List<AutoConfigurationImportFilter> getAutoConfigurationImportFilters() {
 *              return SpringFactoriesLoader.loadFactories(AutoConfigurationImportFilter.class, this.beanClassLoader);
 *         }
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
