package com.company.spring基于注解配置4.spirng基于java配置19.注入Bean的依赖性20;
import org.springframework.context.annotation.*;
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
