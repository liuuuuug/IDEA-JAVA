package github.liuuuuug.oo2;

/**
 * @ClassName: TestExtends
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/29  20:16
 * 继承--黑马
 */
class Animal{
    String name;

public void shout(){
    System.out.println("动物发出呻吟");

}
}
class Dog extends Animal{
    public void printName(){
        System.out.println("name="+name);
        //继承Animal
    }
}

public class TestExtends {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="赖皮猪";
        dog.printName();
        dog.shout();

    }
}