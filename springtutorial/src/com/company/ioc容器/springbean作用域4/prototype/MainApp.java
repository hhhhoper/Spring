package com.company.ioc容器.springbean作用域4.prototype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA=(HelloWorld)context.getBean("spring4_2");
        objA.setMessage("i'am object A");
        objA.getMessage();
        HelloWorld objB=(HelloWorld)context.getBean("spring4_2");
        objB.getMessage();
    }
}
