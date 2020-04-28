package github.liuuuuug.util4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-22
 * Time: 11:31\
 * 通过键值对元素，获取健获取值的方式进行遍历
 */
public class TestHashMap1 {
    public static void main(String[] args) {

        Map map1=new HashMap();

        map1.put("1","javac");
        map1.put("2","cc");
        map1.put("3","py");



        Set entrySet =map1.entrySet();

        Iterator it=entrySet.iterator();
        while (it.hasNext()){
            Map.Entry entry=(Map.Entry) it.next();

            Object key=entry.getKey();
            Object value=entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
