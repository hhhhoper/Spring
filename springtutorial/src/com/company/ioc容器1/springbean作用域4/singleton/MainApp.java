package com.company.ioc容器1.springbean作用域4.singleton;
import  org.springframework.context.ApplicationContext;
import  org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA=(HelloWorld)context.getBean("spring4_1");
        objA.setMessage("i'm object A");
        objA.getMessage();
        HelloWorld objB=(HelloWorld)context.getBean("spring4_1");
        objB.getMessage();
    }
}
