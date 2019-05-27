package com.neuedu.a;

public class test5 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(int i=1;i<=100;i++)
        {
            while(i%2!=0)
            {
                a+=i;
                break;
            }
            do
            {
                if(i%2==0)
                {
                    b+=i;
                }
                break;
            }while(i>100);
        }
        System.out.println("奇数之和为"+a);
        System.out.println("偶数之和为"+b);
    }
}







