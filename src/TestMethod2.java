/**
 * Use:
 *
 * @author:liuuuuug
 * or:方法的重载
 * 黑马+尚学堂
 * time:2020.
 */
public class TestMethod2 {
    public static void main(String[] args) {
       int sum1=add(2,6);
       int sum2=add(4,5,6);
       double sum3=add(3.4,4.5);

        System.out.println("++++++++++++++");
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
        System.out.println("++++++++++++++");
    }
    public static int add(int x,int y){
        return x*y;
    }
    public static int add(int x,int y,int z){
        return x*y*z;
    }
    public static double  add(double x,double y){
        return  x*y;
    }
}
