package com;

import com.models.Shadowing;

public class TestShadowing {
    public static void main(String[] args) {
        Shadowing shadowing = new Shadowing();
        Shadowing.InnerClass inner = shadowing.new InnerClass();
        inner.run();
    }
}
