package com.neuedu.a;

public class testClass {
    public static void main(String[] args) {
        student student = new student();
        student.sfraction="80";
        student.sname="小明";
        student.sage=20;
        System.out.println("学生姓名为:"+student.sname+";分数为:"+student.sfraction+";年龄："+student.sage);
        student.sfraction="90";
        student.sname="小亮";
        student.sage=18;
        System.out.println("学生姓名为:"+student.sname+";分数为:"+student.sfraction+";年龄："+student.sage);
        student.sfraction="95";
        student.sname="小丽";
        student.sage=18;
        System.out.println("学生姓名为:"+student.sname+";分数为:"+student.sfraction+";年龄："+student.sage);
        student.sfraction="80";
        student.sname="小童";
        student.sage=19;
        System.out.println("学生姓名为:"+student.sname+";分数为:"+student.sfraction+";年龄："+student.sage);
        student.sfraction="70";
        student.sname="佳佳";
        student.sage=20;
        System.out.println("学生姓名为:"+student.sname+";分数为:"+student.sfraction+";年龄："+student.sage);
    }
}
