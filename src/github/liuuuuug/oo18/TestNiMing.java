package github.liuuuuug.oo18;

/**
 * @ClassName: TestNiMing
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  18:31
 * 匿名内部类--黑马
 */
interface Animal{
    public abstract void shout();
}
public class TestNiMing {
    public static void main(String[] args) {
       animalShout(new Animal() {
           @Override
           public void shout() {
               System.out.println("喵喵喵？");
           }
       });
    }
    public static void animalShout(Animal an){
        an.shout();
    }
}

