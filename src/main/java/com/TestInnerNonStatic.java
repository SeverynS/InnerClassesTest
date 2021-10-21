package com;

import com.models.OuterNonStaticClass;

public class TestInnerNonStatic {
    public static void main(String[] args) {
        OuterNonStaticClass outerNonStaticClass = new OuterNonStaticClass();
        System.out.println(outerNonStaticClass);
        OuterNonStaticClass.InnerNonStatic innerNonStatic = outerNonStaticClass.new InnerNonStatic(15);
        System.out.println(innerNonStatic);
        outerNonStaticClass.print();
        innerNonStatic.sum();
    }
}
