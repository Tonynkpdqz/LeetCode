package com.nkpdqz._360;

public class TestA {
    private TestB b;

    public TestB getB() {
        return b;
    }

    public void setB(TestB b) {
        this.b = b;
    }

    public TestA(TestB b) {
        this.b = b;
    }

    public TestA() {
    }
}
