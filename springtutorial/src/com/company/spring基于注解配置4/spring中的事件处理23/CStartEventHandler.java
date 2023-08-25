package com.company.spring基于注解配置4.spring中的事件处理23;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler
        implements ApplicationListener<ContextStartedEvent>
{
    public void onApplicationEvent(ContextStartedEvent event){
        System.out.println("ContextStartedEvent Received");
    }
}
