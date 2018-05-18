package com.nkpdqz.junior.design;

import java.util.LinkedList;

public class MinStack {

    private LinkedList<Integer> linkedList;
    /** initialize your data structure here. */
    public MinStack() {
        linkedList = new LinkedList<>();
    }

    public void push(int x) {
        linkedList.addFirst(x);
    }

    public void pop() {
        linkedList.pop();
    }

    public int top() {
        return linkedList.getFirst();
    }

    public int getMin() {
        int resylt = linkedList.get(0);
        for (int i = 1; i < linkedList.size(); i++)
            resylt = linkedList.get(i)>linkedList.get(i-1)?linkedList.get(i-1):linkedList.get(i);
        return resylt;
    }



}
