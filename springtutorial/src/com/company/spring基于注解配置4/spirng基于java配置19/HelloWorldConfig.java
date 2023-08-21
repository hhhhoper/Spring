package com.company.spring基于注解配置4.spirng基于java配置19;
import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
