package com.company.ioc容器.helloworld1;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        System.out.printf("message:"+message);
        return message;
    }
}
