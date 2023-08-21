package com.company.bean自动装配3.构造函数自动装配14;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
       // ApplicationContext context=
         //       new ClassPathXmlApplicationContext("Beans14.xml");
        ApplicationContext context=
                     new ClassPathXmlApplicationContext("Beans14_1.xml");
        TextEditor tx=(TextEditor) context.getBean("textEditor");
        tx.spellCheck();
    }
}
