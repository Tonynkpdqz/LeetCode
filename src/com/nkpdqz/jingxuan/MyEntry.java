package com.nkpdqz.jingxuan;

public class MyEntry<C,V> {
    private C number;
    private V isUsed;

    public C getNumber() {
        return number;
    }

    public void setNumber(C number) {
        this.number = number;
    }

    public V getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(V isUsed) {
        this.isUsed = isUsed;
    }

    public MyEntry(C number, V isUsed) {
        this.number = number;
        this.isUsed = isUsed;
    }

    public MyEntry() {
    }
}
