package github.liuuuuug.oo8;

/**
 * @ClassName: TextOverride1
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/9  12:35
 * 继承后的方法重写---黑马
 */
class Animal1{
    void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal1{
    @Override
    void shout(){
        System.out.println("汪~汪~汪~");

    }
}
public class TextOverride1 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.shout();
    }
}
