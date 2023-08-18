package com.company.spring依赖注入.基于设值函数的依赖注入9;

import com.company.spring依赖注入.基于构造函数的依赖注入8.SpellChecker;

public class TextEditor {
    private SpellChecker spellChecker;
    public  void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker.");
        this.spellChecker=spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
