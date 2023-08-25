package com.company.spring基于注解配置4.spring中的自定义事件24;
import org.springframework.context.ApplicationListener;
public class CustomEventHandler
    implements ApplicationListener<CustomEvent>{
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
