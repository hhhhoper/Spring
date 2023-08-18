package com.company.ioc容器.springbean作用域4.prototype;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("message:"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
