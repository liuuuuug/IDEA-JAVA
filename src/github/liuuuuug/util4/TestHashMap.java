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
 * Time: 10:38
 */
public class TestHashMap {
    public static void main(String[] args) {

        Map map=new HashMap();

        map.put("1","java");
        map.put("2","c");
        map.put("3","python");


        //获取集合所有键

        Set keySet=map.keySet();
        //用迭代器遍历

        Iterator it=keySet.iterator();
        while(it.hasNext()){

            Object key=it.next();

            //通过Map中的get()方法，获取jian对应的值

            Object value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
