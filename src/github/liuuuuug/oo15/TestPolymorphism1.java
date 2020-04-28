package github.liuuuuug.oo15;

/**
 * @ClassName: TestPolymorphism1
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  16:38
 * 多态中的转型--向上--转为父类
 * 黑马
 */
interface Animal{
    public abstract void shout();
}
class Cat implements Animal{

    @Override
    public void shout() {
        System.out.println("miao~miao~miao~");
    }
    public void sleep(){
        System.out.println("猫谁叫~");
    }
}
public class TestPolymorphism1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        animalShout(cat);

    }
    //定义一个静态方法来接收Animal类型的参数

    public static void animalShout(Animal animal){
        animal.shout();
        //不能调用子类的特有方法，除非强制
        //下面是往下转（强制类型转换)

        Cat cat=(Cat)animal;
        cat.sleep();
    }
}
