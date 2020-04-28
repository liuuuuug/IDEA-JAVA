package github.liuuuuug.api6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 19:02
 * 包装类--拆箱
 */
public class TestPacking1 {
    public static void main(String[] args) {
        Integer nnum=new Integer(90);
        int a=10;
        //拆箱过程
        int sum= nnum.intValue()+a;
        System.out.println("sum="+sum);
    }
}
