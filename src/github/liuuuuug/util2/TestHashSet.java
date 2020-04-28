package github.liuuuuug.util2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 20:52
 * Hashset
 * 不能存重复的---取出顺序不一样
 */
public class TestHashSet {
    public static void main(String[] args) {

        HashSet set =new HashSet();

        set.add("java");
        set.add("c");
        set.add("c");
        set.add("python");

        Iterator it = set.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
