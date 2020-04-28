package github.liuuuuug.util;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 15:45
 * Iterator--迭代器--黑马
 */
public class TestIterator {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("d1");
        list.add("d2");
        list.add("d3");
        list.add("d4");

        Iterator it=list.iterator();

        while (it.hasNext()){
            //判断是否存在下一个元素

            Object obj=it.next();
            System.out.println(obj);
        }

    }

}
