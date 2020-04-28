package github.liuuuuug.api3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 14:04
 * Runtime的使用--黑马
 */
public class TestRuntime {
    public static void main(String[] args) {
        //获取runtime类的对象

        Runtime rt=Runtime.getRuntime();
        System.out.println("处理器的个数："+rt.availableProcessors());


        System.out.println("空闲内容数量："+rt.freeMemory()/1024/1024+"M");

        System.out.println("最大的可用内存数量"+rt.maxMemory()/1024/1024+"M");
    }
}
