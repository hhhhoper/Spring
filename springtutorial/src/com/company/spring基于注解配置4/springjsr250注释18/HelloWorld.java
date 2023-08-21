package com.company.spring基于注解配置4.springjsr250注释18;
import javax.annotation.*;
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        System.out.println("Your Message:"+message);
        return message;
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now");
    }
}
