package com.zjac.CrazyJava;

public class StaticAccessNonstatic {
    public void info(){

    }

    public static void main(String[] args) {
        //静态static修饰的静态方法main只能通过重新创建的的类的对象去调用普通方法
        //（1）
        StaticAccessNonstatic s = new StaticAccessNonstatic();
        s.info();
        //（2）
        new StaticAccessNonstatic().info();
    }
}
