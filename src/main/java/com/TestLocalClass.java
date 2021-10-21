package com;

import com.models.LocalClass;

public class TestLocalClass {
    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.innerLocal();
        System.out.println(localClass);
    }
}
