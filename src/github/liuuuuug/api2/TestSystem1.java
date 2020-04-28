package github.liuuuuug.api2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 13:48
 * System类的使用
 */
public class TestSystem1 {
    public static void main(String[] args) {

        //计算程序求和所用时间
        long startTime = System.currentTimeMillis();
        int sum=0;

        for(int i = 0;i<10000000;i++){
            sum+=i;

        }

        long endTime=System.currentTimeMillis();

        System.out.println("程序运行的时间为"+(endTime-startTime)+"毫秒");
    }
}
