package com.zjac.CrazyJava;

public class Varargs {
    //定义了形参个数可变的方法
    public static void test(int a,String...books){
        for (String tmp:books){
            System.out.println(tmp);
        }
        //输出整数变量a的值
        System.out.println(a);
    }
    public static void main(String[] args) {
     //调用test方法
     test(8,"可以传入多个参数","形参个数可变","一个方法中只能有一个个数可变的形参","个数可变形参只能处于列表最后");
    }
}
