package com.models;

public class OuterNonStaticClass {
    private int field = 10;

    InnerNonStatic innerNonStatic = new InnerNonStatic(100);

    public void print(){
        System.out.println(innerNonStatic);
        innerNonStatic.sum();
    }

    @Override
    public String toString() {
        return "OuterNonStaticClass{" +
                "field=" + field +
                '}';
    }

    public class InnerNonStatic{
        private int innerfiled;

        public InnerNonStatic(int innerfiled) {
            this.innerfiled = innerfiled;
        }

        public void sum(){
            System.out.println(this.innerfiled + 1);
        }

        @Override
        public String toString() {
            return "InnerNonStatic{" +
                    "innerfiled=" + innerfiled +
                    '}';
        }
    }
}
