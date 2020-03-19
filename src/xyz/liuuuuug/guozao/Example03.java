package xyz.liuuuuug.guozao;

import java.time.Period;

/**
 * Created on 2020/3/19.
 *构造方法的重载--黑马
 * @author liuuuuug
 */
class   Person02{
    String name;
    int age;
    //定义两个参数的构造方法

    public     Person02(String con_name,int con_age){
        name = con_name;
        age=con_age;
    }
    //定义一个参数的构造方法

    public  Person02(String con_name){
        name=con_name;
    }
    public void speak(){
        System.out.println("大家好，我叫："+name+",我今年"+age+"岁");

    }
}
public class Example03 {
    public static void main(String[] args) {
        Person02 p1 = new Person02("zhu");
        Person02 p2 = new Person02("zeze",99);

        //通过对象ps1和ps2调用speak()的方法
        p1.speak();
        p2.speak();
    }
}
