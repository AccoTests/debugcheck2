package com.ht.debugcheck2.code;

public class Calc2 implements ICalc {

    public Double add(int a, int b) {
        throw new RuntimeException("Don't use this add method. Use the Calc1 class if you need add");
    }

    public int divide(int a, int b){
        return a/b;
    }
}
