package com.zjac.animal;


/**
 * Created by Administrator on 2019/3/28.
 *
 * 宠物猫类
 * @author zjac
 *
 */
/**@prama 定义类的语法
 * 修饰符 class 类名{
 * 零到多个构造器定义...
 * 零到多个成员变量定义...
 * 零到多个方法...
 }*/
public class Cat {
    //属性：昵称、年龄、体重、品种
    String name;//昵称 String类型默认值null
    int month;//年龄 int类型默认值0
    double weight;//体重 double类型默认值0.0
    String species;//品种

    //方法：跑动、吃东西
    //跑动的方法
    public  void run(){//无参方法
        System.out.println("小猫快跑");
    }

    //运用了方法重载
    public void run(String name){//带参方法
        System.out.println(name+"快跑");
    }
    //吃东西的方法
    public void eat(){
        System.out.println("小猫吃鱼");
    }


}
