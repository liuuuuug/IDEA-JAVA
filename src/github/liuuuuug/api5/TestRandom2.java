package github.liuuuuug.api5;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 18:50
 * Random类的用法
 */
public class TestRandom2 {
    public static void main(String[] args) {

        Random r1=new Random();

        System.out.println("产生float类型的数："+r1.nextFloat());
        System.out.println("产生0-100之间int类型的整数："+r1.nextInt(100));
        System.out.println("产生double类型的随机数："+r1.nextDouble());
    }
}
