package com.company.spring依赖注入2.Spring注入集合11;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("Beans11.xml");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressProp();
        jc.getAddressMap();
    }
}
