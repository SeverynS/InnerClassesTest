package com;

import com.models.OuterStaticClass;

public class TestStatic {
    public static void main(String[] args) {
        OuterStaticClass.InnerStatic innerStaticInnerClass = new OuterStaticClass.InnerStatic(25);
        System.out.println(innerStaticInnerClass);
        innerStaticInnerClass.sum();
        OuterStaticClass outerStaticClass = new OuterStaticClass();
        outerStaticClass.print();
    }
}
