package github.liuuuuug.api2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 13:53
 * System类的使用--arraycopy--黑马
 *
 */
public class TestSystem2 {
    public static void main(String[] args) {

        int[] fromArray={101,102,103,104};
        int[] toArray = {233,555,668,888,889};

        System.arraycopy(fromArray,2,toArray,2,2);

        for(int o=0;o<toArray.length;o++){

            System.out.println(o+":"+toArray[o]);

        }
    }
}
