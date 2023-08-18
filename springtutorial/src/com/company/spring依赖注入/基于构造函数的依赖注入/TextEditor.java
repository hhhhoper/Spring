package com.company.spring依赖注入.基于构造函数的依赖注入;

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor");
        this.spellChecker=spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
