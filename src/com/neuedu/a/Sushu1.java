package com.neuedu.a;

import java.sql.SQLOutput;

public class Sushu1 {
    public static void main(String[] args) {
        for (int  i = 101; i <=200;i++) {
            for (int m = 2;m <=i;m++){
                if (i != m &&i%m==0) {
                    break;
                }
                if (i==m &&i%m==0){
                    System.out.println(i);
                }
            }
        }


    }
}
