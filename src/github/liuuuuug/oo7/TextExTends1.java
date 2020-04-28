package github.liuuuuug.oo7;

import org.w3c.dom.ls.LSOutput;

/**
 * @ClassName: TextExTends1
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  12:10
 * 继承---黑马
 */
class Animal{
    String name;

    public void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal{
    public void printName(){
        System.out.println("name="+name);

    }
}

public class TextExTends1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="沙皮狗";
        dog.printName();
        dog.shout();

    }
}
