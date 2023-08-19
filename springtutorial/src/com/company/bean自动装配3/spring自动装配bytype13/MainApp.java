package com.company.bean自动装配3.spring自动装配bytype13;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("")
    }
}
