package com.company.spring基于注解配置4.springjsr250注释18;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context=
                new ClassPathXmlApplicationContext("Beans18.xml");
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
        context.registerShutdownHook();
    }
}
