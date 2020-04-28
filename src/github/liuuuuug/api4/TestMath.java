package github.liuuuuug.api4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 15:57
 * math类应用
 *
 *
 */
public class TestMath {
    public static void main(String[] args) {

        System.out.println("计算绝对值后的结果："+Math.abs(-1));
        System.out.println("求 大于参数的最小整数："+Math.ceil(5.8));

        System.out.println("求小于参数的最大整数："+Math.floor(-4.6));

        System.out.println("对小鼠进行四舍五入的结果；"+Math.round(8.9));

        System.out.println("返回较大的值为："+Math.max(9.8,6.8));
        System.out.println("返回的最小值为："+Math.min(99.3,9.5));

        System.out.println("随机生成一个大于0.0小于1.0的值；"+Math.random());


    }
}
