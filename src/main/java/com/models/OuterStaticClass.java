package com.models;

public class OuterStaticClass {
    private int field = 1;

    InnerStatic aInnerStatic = new InnerStatic(10);

    public void print(){
        System.out.println(aInnerStatic);
    }

    public static class InnerStatic {
        private int inner;

        public InnerStatic(int inner) {
            this.inner = inner;
        }

        public void sum(){
            System.out.println(this.inner + 1);
        }

        @Override
        public String toString() {
            return "Static{" +
                    "inner=" + inner +
                    '}';
        }
    }
}
