package com.fcjy;

import com.alibaba.druid.pool.ExceptionSorter;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        ApplicationContext

        SpringApplication.run(DemoApplication.class, args);
    }

}
