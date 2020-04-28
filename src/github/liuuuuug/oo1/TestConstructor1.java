package github.liuuuuug.oo1;

/**
 * @ClassName: TestConstructor1
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/29  19:41
 * 构造器（构造方法）---黑马--无参
 */
class Person{
    public Person(){
        System.out.println("无参的构造方法被调用。。。");
    }
}
public class TestConstructor1 {
    public static void main(String[] args) {
        Person p=new Person();
    }
}
