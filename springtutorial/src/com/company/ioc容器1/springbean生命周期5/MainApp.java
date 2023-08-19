package com.company.ioc容器1.springbean生命周期5;
import  org.springframework.context.support.AbstractApplicationContext;
import  org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context=new
                ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj=(HelloWorld)context.getBean("spring5");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
