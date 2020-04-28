package github.liuuuuug.api5;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 17:19
 * Random使用
 */
public class TestRandom {
    public static void main(String[] args) {

        Random r= new Random();
//随机10个数
        for(int i=0;i<10;i++){
            System.out.println(r.nextInt(100));
        }
    }
}
