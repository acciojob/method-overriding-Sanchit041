package com.driver;

public class Main {
    public static void main(String[] args) {
        B a = new B();
        A b = new B();
        b.meth();
        a.meth();
        System.out.println(b.meth());
        System.out.println(a.meth());
    }
  
}