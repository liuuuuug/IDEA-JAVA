package github.liuuuuug.util4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-21
 * Time: 9:10
 HashMap
 */
public class TestMap {
    public static void main(String[] args) {
        //
        Map map=new HashMap();
        map.put("1","tom");
        map.put("2","rose");
        map.put("3","Mary");




        System.out.println("1:"+map.get("1"));
        System.out.println("2:"+map.get("2"));
        System.out.println("3:"+map.get("3"));
    }
}
