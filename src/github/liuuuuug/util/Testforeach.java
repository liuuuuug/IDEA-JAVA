package github.liuuuuug.util;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 16:01
 * for-each
 */
public class Testforeach {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("java");
        list.add("c");
        list.add("python");

        for(Object obj :list){
            System.out.println(obj);

        }
    }
}
