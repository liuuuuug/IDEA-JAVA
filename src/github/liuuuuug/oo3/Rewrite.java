package github.liuuuuug.oo3;

/**
 * @ClassName: Rewrite
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/29  21:22
 * 重写--黑马
 * 子类重写父类的方法，保证子类的方法权限必须大于或者等于父类的权限
 *
 */
class Animal{
    void shout(){
        System.out.println("动物发出叫声");
    }

}
class Dog extends Animal{
    void shout(){
        System.out.println("guagua");

    }

}
public class Rewrite {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.shout();
    }

}
