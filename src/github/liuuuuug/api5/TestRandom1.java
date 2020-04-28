package github.liuuuuug.api5;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 17:24
 * Random使用
 */
public class TestRandom1 {
    public static void main(String[] args) {

        Random r=new Random(19);

        for(int i=0;i<10;i++){
            System.out.println(r.nextInt(100));
        }
    }
}
