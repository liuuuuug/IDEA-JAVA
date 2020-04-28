package github.liuuuuug.oo12;



/**
 * @ClassName: TextSuper
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  12:49
 * super关键字---用来在子类去访问父类的成员
 * 静态方法中不允许使用this和super
 */
class Animal{
    String name="动物";

    public void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal{
    String name="犬类";

    @Override
    public void shout(){
        super.shout();
    }
    public void printName(){
        System.out.println("name="+super.name);
    }
}
public class TextSuper {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.shout();
        dog.printName();
    }
}
