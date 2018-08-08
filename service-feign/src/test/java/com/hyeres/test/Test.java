package com.hyeres.test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s1=" ab";
        String s2=" a" + " b";
        String s3 = " a";
        String s4=" b",s5=s3+s4;
        System.out.println(s5==s2);
        System.out.println("s5="+s5);
        System.out.println("s2="+s2);
        System.out.println(s5.equals(s2));
        String s6=s1.intern();
        System.out.println(s1==s6);

        byte a=116;
        byte b=12;
//        b = a+b;
        System.out.println(b);
        System.out.println(b+=a);
        String[] str = new String[3];
        str[0] = "1";
        str[1] = "3";
        str[2] = "2";
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
