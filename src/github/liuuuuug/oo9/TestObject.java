package github.liuuuuug.oo9;

/**
 * @ClassName: TestObject
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/2  20:56
 * Object类---尚学堂--toString
 */
class Person{
    String name;
    int age;
    @Override
    public String toString(){
        return name+",年龄："+age;
    }
}
public class TestObject {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=20;
        p.name="著上天";
        System.out.println("info："+p);

        TestObject t= new TestObject();
        System.out.println(t);
    }
}
