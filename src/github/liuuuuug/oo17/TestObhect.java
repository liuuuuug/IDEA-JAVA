package github.liuuuuug.oo17;

/**
 * @ClassName: TestObhect
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  17:21
 * Object类中的重写
 */
class Animal1{
    public String toString1(){
        return "这是一个动物";
    }

}
public class TestObhect {
    public static void main(String[] args) {
        Animal1 animal =new Animal1();
        System.out.println(animal.toString1());
    }
}
