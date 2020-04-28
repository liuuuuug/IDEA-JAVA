package github.liuuuuug.util5;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-25
 * Time: 8:44
 * Properties使用
 */
public class TestProperties {
    public static void main(String[] args) {


        Properties p = new Properties();
        p.setProperty("Backgroup-color","red");
        p.setProperty("Font-Size","14px");
        p.setProperty("Language","chinese");

        //获取所有键
       Enumeration names =p.propertyNames();


       //遍历集合得到每一健
        while(names.hasMoreElements()){
            //判断是否有下一个元素可以获取，相当于hasNext()

            String key=(String) names.nextElement();
//通过Properties集合中的方法，得到对应的值
       String value=     p.getProperty(key);

            System.out.println(key+":"+value);

        }

    }
}
