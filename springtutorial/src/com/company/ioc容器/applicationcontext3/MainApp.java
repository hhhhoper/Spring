package com.company.ioc容器.applicationcontext3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("//home//lqy//文档//Spring//springtutorial//src//Beans.xml");
        HelloWorld obj=(HelloWorld) context.getBean("applicationcontext");
        obj.getMessage();
    }
}
/*
第一步生成工厂对象。加载完指定路径下 bean 配置文件后，利用框架提供的 FileSystemXmlApplicationContext API 去生成工厂 bean。FileSystemXmlApplicationContext 负责生成和初始化所有的对象，比如，所有在 XML bean 配置文件中的 bean。

第二步利用第一步生成的上下文中的 getBean() 方法得到所需要的 bean。 这个方法通过配置文件中的 bean ID 来返回一个真正的对象。一旦得到这个对象，就可以利用这个对象来调用任何方法。
 */