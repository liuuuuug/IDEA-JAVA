package github.liuuuuug.util7;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-25
 * Time: 9:15
 * 泛型
 * 使用
 */
public class Generic {
    public static void main(String[] args) {

        ArrayList<String > list=new ArrayList<>();

        list.add("String");
        list.add("Collection");

        //遍历

        for(String str:list){
            System.out.println(str);
        }

    }
}
