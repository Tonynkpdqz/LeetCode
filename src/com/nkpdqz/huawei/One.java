package com.nkpdqz.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        String[] each = s.split(" ");
        int length = each.length;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (each[i].length()>8){
                int k = 0;
                for (int j = 0; j < each[i].length()/8; j=j+8) {
                    String ss = each[i].substring(j, j + 8);
                    list.add(ss);
                    k = k+8;
                }
                if (k!=each[i].length()){
                    String ss = each[i].substring(k);
                    for (int j = 0; j < 8-(each[i].length()-k); j++) {
                        ss = ss +"0";
                    }
                    list.add(ss);
                }
            }else {
                String ss = each[i];
                for (int j = 0; j < 8-each[i].length(); j++) {
                    ss = ss + "0";
                }
                list.add(ss);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String sss:list
             ) {
            sb.append(sss).append(" ");
        }
        System.out.println(sb.toString());
        /*String s = in.nextLine();
        String[] strs = s.split(" ");
        int[] first = new int[4];
        int[] sec = new int[4];
        int[] mask = new int[4];
        int[] firres = new int[4];
        int[] secres = new int[4];
        int res = 1;
        String[] firstSplit = strs[0].split("\\.");
        String[] secSplit = strs[1].split("\\.");
        String[] maskSplit = strs[2].split("\\.");
        for (int i = 0; i < first.length; i++) {
            first[i] = Integer.parseInt(firstSplit[i]);
            sec[i] = Integer.parseInt(secSplit[i]);
            mask[i] = Integer.parseInt(maskSplit[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < first.length; i++) {
            firres[i] = first[i]&mask[i];
            secres[i] = sec[i] & mask[i];
            if (firres[i] != secres[i])
                res = 0;
        }
        sb.append(firres[0]).append(".")
                .append(firres[1]).append(".")
                .append(firres[2]).append(".")
                .append(firres[3]);
        String ans = sb.toString();
        System.out.println(res+" "+ans);*/
    }

}
