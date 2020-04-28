package github.liuuuuug.oo12;

/**
 * @ClassName: TextSuper2
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  13:31
 * 用super关键字掉父类有参构造方法--黑马
 */
class Animal3{
    public Animal3(String name){
        System.out.println("你是一直"+name);
    }
}
class Dog4 extends Animal3{

    public Dog4(String name) {
        super("沙皮狗");
    }
}
public class TextSuper2 {
    public static void main(String[] args) {
        Dog4 dog4=new Dog4("shenmo");
    }
}
