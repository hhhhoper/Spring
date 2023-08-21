package com.company.bean自动装配3.构造函数自动装配14;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    public TextEditor(SpellChecker spellChecker,String name) {
        this.spellChecker=spellChecker;
        this.name=name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }
    public void setSpellChecker(){
        spellChecker.checkSpelling();
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
