package github.liuuuuug.oo12;

/**
 * @ClassName: TextSupper1
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  13:06
 * super()访问父类的构造方法
 */
class Animal1{
    public Animal1(){
        System.out.println("父类的构造方法");
    }
}
class Dog1 extends Animal1{

    public Dog1(){
        //super(); 可省略（父类空参的情况下）
        System.out.println("子类的构造方法");
    }
}
public class TextSupper1 {
    public static void main(String[] args) {
        Dog1 dog1=new Dog1();
    }
}
