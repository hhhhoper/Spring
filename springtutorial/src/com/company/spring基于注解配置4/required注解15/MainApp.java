package com.company.spring基于注解配置4.required注解15;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("Beans15.xml");
        Student student=(Student) context.getBean("student");
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());
    }
}
