package com.company.spring依赖注入2.spring注入内部Beans10;

public class TextEditor {
    private SpellChecker spellChecker;
    //a setter method to inject the dependency
    public  void  setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker");
        this.spellChecker=spellChecker;
    }
    public  SpellChecker getSpellChecker(){
        return  spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
