package xyz.liuuuuug.oo3.leiyuduixiang;

/**
 * Created on 2020/3/22.
 *创建对象--黑马
 * @author liuuuuug
 */
public class Ex01 {
    public static void main(String[] args) {
        Person p1= new Person();
        Person p2= new Person();
        //创建了两个对象

        p1.age=10;
        //给age赋值

        p1.speak();
        p2.speak();
        //调用对象的方法


    }
}
