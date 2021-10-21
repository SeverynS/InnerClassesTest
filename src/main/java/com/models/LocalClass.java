package com.models;

public class LocalClass {
    private int field;

    public void innerLocal(){
        class Summarize{
            int innerLocal = 10;

            private int sum(int x){
                return x + 1;
            }

            @Override
            public String toString() {
                return "Summarize{" +
                        "innerLocal=" + innerLocal +
                        '}';
            }
        }
        System.out.println(new Summarize());
        System.out.println(new Summarize().sum(20));
    }
}
