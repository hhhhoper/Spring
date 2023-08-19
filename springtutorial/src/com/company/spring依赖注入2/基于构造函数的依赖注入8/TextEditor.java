package com.company.spring依赖注入2.基于构造函数的依赖注入8;

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
