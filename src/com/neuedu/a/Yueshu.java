package com.neuedu.a;

import java.util.Scanner;

public class Yueshu {
    public static void main(String[] args) {
        System.out.println("输入两个正整数:");
        Scanner a=new Scanner(System.in);
        int m=a.nextInt();
        Scanner b=new Scanner(System.in);
        int n=b.nextInt();
        int c=m*n;
        int d=0;
        if(m==n)
        {
            System.out.println("最大公约数和最小公倍数均为："+m);
        }
        else
        {
            if(m>n)
            {
                while(n>0)
                {
                    d=m;
                    m=n;
                    n=d%m;
                }
                System.out.println("最大公约数为"+m);
                System.out.println("最小公倍数为"+c/m);
            }
            else
            {
                while(m>0)
                {
                    d=n;
                    n=m;
                    m=d%n;
                }
                System.out.println("最大公约数为"+n);
                System.out.println("最小公倍数为"+c/n);
            }
        }
    }
}
