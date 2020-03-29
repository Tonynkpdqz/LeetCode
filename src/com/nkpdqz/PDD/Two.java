package com.nkpdqz.PDD;


import java.util.*;

public class Two {
    public static void main(String[] args) {
        TreeSet<Character> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = s.toUpperCase();
        String s1 = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if ((s1.charAt(i)>='A'&&s1.charAt(i)<='Z') || (s1.charAt(i)>='a'&&s1.charAt(i)<='z'))
                set.add(s1.charAt(i));
        }
        Character first = set.first();
        Object o = new Object();
        o.hashCode();
        String s3 = first.toString().toUpperCase();
        /*for (int i = 0; i < s.length(); i++) {

            if (s2.charAt(i) == first+('a'-'A')) {
                String s3 = first.toString().toUpperCase();
                System.out.println();
                break;
            }
        }*/
        System.out.println(first);
    }
}
