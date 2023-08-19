package com.company.ioc容器1.springbean作用域4.singleton;

public class HelloWorld{
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message:"+message);
    }
}
