package github.liuuuuug.api;

/**
 * @ClassName: example1
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  20:52
 * string类---黑马
 * 字符串基本操作
 * 从零开始
 */
public class example1 {
    public static void main(String[] args) {
        String s="iedjjajdfiofjiof";
        System.out.println("字符串的长度为："+s.length());
        System.out.println("获取字符串的第三个字符："+s.charAt(3));
        System.out.println("获取字符j第一次出现的位置："+s.indexOf('j'));
        System.out.println("获取字符j字符最后出现的位置："+s.lastIndexOf('j'));
        System.out.println("获取字串ja第一次出现的位置："+s.indexOf("ja"));
        System.out.println("获取字串ja最后一次出现的位置"+s.lastIndexOf("ja"));

    }
}
