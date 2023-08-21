package com.company.spring基于注解配置4.spirng基于java配置19.注入Bean的依赖性20;

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker=spellChecker;
    }
    public void spellChecker(){
        spellChecker.checkSpelling();
    }
}
