package com.nkpdqz.jingxuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TwoStackOneQueue {

    public void TwoStackOneQueue(){
        System.out.println("test");
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        Iterator<Integer> iterator = stack1.iterator();
        while (iterator.hasNext()){
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        Integer pop1 = stack2.pop();
        Iterator<Integer> iterator1 = stack2.iterator();
        while (iterator1.hasNext()){
            Integer pop = stack2.pop();
            stack1.push(pop);
        }
        /*for (Integer i:stack1) {
            stack1.pop();
            stack2.push(i);
        }*/
        /*Integer pop = stack2.pop();
        for (Integer i:stack2
             ) {
            stack2.pop();
            stack1.push(i);
        }*/
        return pop1;

    }

    public static void main(String[] args) {
        TwoStackOneQueue queue = new TwoStackOneQueue();
        /*queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());*/

        queue.TwoStackOneQueue();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 3)
                iterator.remove();
        }
        for (Integer i:list
             ) {
            System.out.println(i);
        }
    }

}
