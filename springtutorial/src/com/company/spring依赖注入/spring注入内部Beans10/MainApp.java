package com.company.spring依赖注入.spring注入内部Beans10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("Beans10.xml");
        TextEditor te=(TextEditor) context.getBean("spring10_TextEditor");
        te.spellCheck();
    }
}
