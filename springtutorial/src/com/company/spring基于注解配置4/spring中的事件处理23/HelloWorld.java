package com.company.spring基于注解配置4.spring中的事件处理23;

public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message=message;
    }
    public void getMessage(){
        System.out.println("Your Message:"+message);
    }
}
