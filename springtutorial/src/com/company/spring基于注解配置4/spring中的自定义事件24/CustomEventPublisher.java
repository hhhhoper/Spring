package com.company.spring基于注解配置4.spring中的自定义事件24;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void publish(){
        CustomEvent ce=new CustomEvent(this);
        publisher.publishEvent(ce);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
            this.publisher=publisher;
    }
}