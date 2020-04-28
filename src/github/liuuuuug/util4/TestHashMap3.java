package github.liuuuuug.util4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-22
 * Time: 11:50
 * hasgmap--li
 */
public class TestHashMap3 {
    public static void main(String[] args) {

        Map map=new LinkedHashMap();

        map.put("1","ja");
        map.put("2","ss");
        map.put("3","ff");

        Set keySet=map.keySet();

        Iterator it = keySet.iterator();
        while (it.hasNext()){
            Object key=it.next();

            Object value=map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
