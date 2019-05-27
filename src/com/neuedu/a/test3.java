package com.neuedu.a;

public class test3 {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int a=0;a<10;a++){
                for (int b=0;b<10;b++){
                   if ((i*100+a*100+b*100)==(i*i*i+a*a*a+b*b*b)){
                       System.out.println(i*100+a*10+b);
                   }
                }
            }
        }
    }
}
