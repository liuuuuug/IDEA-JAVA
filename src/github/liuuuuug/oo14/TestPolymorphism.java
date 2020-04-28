package github.liuuuuug.oo14;

/**
 * @ClassName: TestPolymorphism
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  21:31
 * 初见多态---黑马
 * 对象的多态性
 * 父类或者是接口引用 = new 子类的对象
 */
interface Animal{
    void shout();
}
class Cat implements Animal{

    @Override
    public void shout() {
        System.out.println("喵~喵~喵");
    }
}
class Dog implements Animal{

    @Override
    public void shout() {
        System.out.println("汪~汪~wang~");
    }
}
public class TestPolymorphism {
    public static void main(String[] args) {
        Animal an1=new Cat();
        Animal an2=new Dog();
        animalShout(an1);
        animalShout(an2);
    }

    //定义一个静态方法来接收--多态的扩展性

    public static void animalShout(Animal an){
        an.shout();
    }
}
