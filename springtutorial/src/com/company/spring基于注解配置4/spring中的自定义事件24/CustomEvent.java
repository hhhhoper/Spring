package com.company.spring基于注解配置4.spring中的自定义事件24;
import org.springframework.context.ApplicationEvent;
public class CustomEvent extends  ApplicationEvent{
    public CustomEvent(Object source){
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}
