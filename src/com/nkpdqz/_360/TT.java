package com.nkpdqz._360;

public class TT {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        String s = "123";
        s = "456";
        String s1 = "456";
        String bb = "123";
        StringBuilder sb = new StringBuilder();
        sb.append("123");
        StringBuilder reverse = sb.reverse();
        System.out.println(sb.toString());
        System.out.println(s==s1);
        System.out.println(a==b);
        System.out.println(s.equals(bb));
        System.out.println(s==bb);
        Test test = new Test() {
            @Override
            public void me() {

            }
        };

        inf inf = new inf() {
            @Override
            public void X() {

            }
        };
    }

}
