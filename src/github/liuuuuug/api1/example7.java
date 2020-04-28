package github.liuuuuug.api1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 10:23
 * 记录一个字符串出现的次数
 *
 *
 */
public class example7 {
    public static void main(String[] args) {


        String str = "jidisjiissiji";
        String key = "ji";
        int count = getKeyStringCount(str, key);
        System.out.println("count ="+ count);


    }

    public static int getKeyStringCount(String str, String key) {

        int count = 0;
        if (!str.contains(key)) {
            return count;
        }

        int index = 0;

        while ((index = str.indexOf(key)) != -1) {

            count++;

            str = str.substring(index + key.length());
        }
        return count;
    }

}