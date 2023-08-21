package com.company.spring基于注解配置4.spirng基于java配置19.注入Bean的依赖性20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te=ctx.getBean(TextEditor.class);
        te.spellChecker();

    }
}
