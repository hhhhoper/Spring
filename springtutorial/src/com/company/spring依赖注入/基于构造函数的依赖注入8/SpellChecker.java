package com.company.spring依赖注入.基于构造函数的依赖注入8;

public class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor");
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling");
    }
}
