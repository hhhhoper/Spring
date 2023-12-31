package com.company.spring基于注解配置4.spring中的事件处理23;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=
                new ClassPathXmlApplicationContext("Beans23.xml");

        //Let us raise a start event.
        context.start();
        HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
        obj.getMessage();
        //Let us raise a stop event
        context.stop();
    }
}
