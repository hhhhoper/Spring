package com.company.spring基于注解配置4.spirng基于java配置19;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        System.out.println("Your Message:"+message);
        return  message;
    }
}
