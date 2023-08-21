package com.company.spring基于注解配置4.Qualifier注解17;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans17.xml");
        Profile profile=(Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
