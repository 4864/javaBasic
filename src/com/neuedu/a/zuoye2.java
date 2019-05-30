package com.neuedu.a;

import java.sql.SQLOutput;

public class zuoye2 {
   private String name;
   private String sex;
   private String date;
   private int num;
   private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void computeSalay(){
        System.out.println(num*salary);

    }




}
