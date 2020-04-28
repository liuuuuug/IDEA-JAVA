package github.liuuuuug.api2;

import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 13:27
 * system类的使用
 */
public class TestSystem {
    public static void main(String[] args) {

        Properties properties=System.getProperties();
        System.out.println(properties);

        Set<String> propertyNames = properties.stringPropertyNames();

        for(String key : propertyNames){

            String value = System.getProperty(key);
            System.out.println(key+"----->"+value);

        }
    }
}
