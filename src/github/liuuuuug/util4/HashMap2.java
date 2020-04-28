package github.liuuuuug.util4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-22
 * Time: 11:41
 * HashMap
 * valuesd方法使用
 */
public class HashMap2 {
    public static void main(String[] args) {

        Map map=new HashMap();

        map.put("1","java");
        map.put("2","rose");
        map.put("3","pyc");

        Collection values=map.values();

        Iterator it=values.iterator();
        while (it.hasNext()){
            Object value=it.next();
            System.out.println(value);
        }





    }
}
