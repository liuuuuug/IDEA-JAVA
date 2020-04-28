package github.liuuuuug.oo4;

/**
 * @ClassName: TestSuper
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/29  22:03
 * super关键字--黑马
 * super（）
 */
class Animal{
    public Animal(){
        System.out.println("你是一只动物");
    }
    //上面无参构造方法
    //下面有参构造方法
    public Animal(String name){
        System.out.println("你是一只"+name);
    }
}
class Dog extends Animal{
    public Dog(){
        super("沙皮狗");
        //此时用的是上面父类有参的构造方法
        //注释掉super用的是无参

    }
}
public class TestSuper {
    public static void main(String[] args) {
        Dog dog=new Dog();

    }

}
