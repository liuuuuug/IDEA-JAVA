package github.liuuuuug.oo17;

/**
 * @ClassName: TestObject
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  17:16
 * object中的tostring
 */
class Animal{
    public void shout(){
        System.out.println("动物叫。。。");
    }
}
public class TestObject {
    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println(animal.toString());

    }
}
