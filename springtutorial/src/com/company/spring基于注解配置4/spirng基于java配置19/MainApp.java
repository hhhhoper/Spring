package com.company.spring基于注解配置4.spirng基于java配置19;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld=ctx.getBean(HelloWorld.class);
        //HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
        helloWorld.setMessage("Hello World");
        helloWorld.getMessage();
    }
}
