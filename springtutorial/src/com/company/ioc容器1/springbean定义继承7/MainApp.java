package com.company.ioc容器1.springbean定义继承7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp
{
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA=(HelloWorld)context.getBean("spring7");
        objA.getMessage1();
        objA.getMessage2();
        HelloIndia objB = (HelloIndia) context.getBean("spring7_1");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
