package com.neuedu.a;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("输入年份");
        int a =input.nextInt();
        if(a%4==0&&a%100!=0||a%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }


    }

    }

