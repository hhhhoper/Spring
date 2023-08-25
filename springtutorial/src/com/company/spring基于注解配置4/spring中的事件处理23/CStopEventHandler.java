package com.company.spring基于注解配置4.spring中的事件处理23;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler
implements ApplicationListener<ContextStoppedEvent>
{

    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("ContextStoppedEvent Received");
    }
}

