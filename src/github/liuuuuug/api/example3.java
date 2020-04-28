package github.liuuuuug.api;

/**
 * @ClassName: example3
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  21:19
 * String类替换与去除空格操作--黑马
 */
public class example3 {
    public static void main(String[] args) {
        String s="fhsij";

        System.out.println("将fh替换成cn.fh后的结果"+s.replace("fh","cn.fh"));
        String s1=" i p i o k p";
        System.out.println("将字符串去左右空格"+s1.trim());
        System.out.println("去除全部空格后果："+s1.replace(" ",""));
    }
}
