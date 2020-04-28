package github.liuuuuug.oo11;

/**
 * @ClassName: TestPolym
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/2  21:52
 *
 * 多态--黑马
 */
interface Animal{
    public abstract void shout();
}
class Cat implements Animal{
    @Override
    public void shout() {
    System.out.println("喵~喵~");
    }
}
class Dog implements Animal{
    @Override
    public void shout(){
        System.out.println("wang~wang~");
    }
}

public class TestPolym {
    public static void main(String[] args) {
        Animal an1=new Cat();
        Animal an2=new Dog();
        //an1.shout();
        //an2.shout();
        animalshout(an1);
        animalshout(an2);
    }
    //定义一个静态方法

    public static void animalshout(Animal an){
        an.shout();
    }
}
