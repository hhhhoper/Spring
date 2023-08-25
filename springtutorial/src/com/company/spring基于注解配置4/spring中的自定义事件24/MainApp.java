package com.company.spring基于注解配置4.spring中的自定义事件24;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=
                new ClassPathXmlApplicationContext("Beans24.xml");
        CustomEventPublisher cvp=
                (CustomEventPublisher)context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
    }
}
