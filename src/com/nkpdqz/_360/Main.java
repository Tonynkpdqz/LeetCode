package com.nkpdqz._360;

public class Main {
    public static void main(String[] args) {
        TestA a = new TestA();
        TestB b = new TestB(a);
        a.setB(b);
    }
}
