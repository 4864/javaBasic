package com.neuedu.a;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a =scanner.next();
        char b =a.charAt(0);
        if (a.length()>1){
            System.out.println("请输入一个字符");
        }else if (b>=97&&b<=122){
            b-=32;
            System.out.println(b);
        }else{
            System.out.println(b);
        }
        }
}
