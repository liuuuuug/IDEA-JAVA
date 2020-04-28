package github.liuuuuug.util;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 16:07
 * for 与for-each对比
 */
public class Testforeach1 {
    public static void main(String[] args) {

        String [] strs={"aaa","bbb","ccc"};

        for (String str1: strs) {
            str1="ddd";

        }
        System.out.println("for-each循环修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);

        for (int i=0;i<strs.length;i++){
            strs[i]="ddd";
        }
        System.out.println("普通for循环修改后的数组"+strs[0]+","+strs[1]+","+strs[2]);


    }
}
