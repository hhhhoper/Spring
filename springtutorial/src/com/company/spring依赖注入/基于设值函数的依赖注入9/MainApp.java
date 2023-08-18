package com.company.spring依赖注入.基于设值函数的依赖注入9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te=(TextEditor)context.getBean("spring设置函数TextEditor");
        te.spellCheck();
    }
}
