package com.company.ioc容器1.helloworld1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj=(HelloWorld) context.getBean("helloworld");
        obj.getMessage();
    }
}
