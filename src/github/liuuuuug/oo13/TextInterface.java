package github.liuuuuug.oo13;

/**
 * @ClassName: TextInterface
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  20:20
 * 接口--黑马
 */
interface Animal{
    //定义全局变量，默认修饰符为public static final 可以不写

    public static final String ANIMAL_BEHAVIOR ="动物的行为";

    public abstract void breathe();
    public abstract void run();
}
class Dog implements Animal{

    @Override
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR+"你在呼吸");
    }

    @Override
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR+"狗在奔跑");

    }
}
public class TextInterface {
    public static void main(String[] args) {
        Dog dog=new Dog();

        dog.breathe();
        dog.run();

    }
}
