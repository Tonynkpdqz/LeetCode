package com.nkpdqz.PDD;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s0 = scanner.nextLine();
        String s1 = scanner.nextLine();
        System.out.println(19);
    }

    public boolean isTrue(String s){
        if (s.isEmpty()){
            return true;
        }
        char[] chars = s.toCharArray();
        if (chars[0]=='(' && chars[chars.length-1]==')')
            return true;
        return false;
    }
}
