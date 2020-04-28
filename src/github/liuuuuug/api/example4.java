package github.liuuuuug.api;

/**
 * @ClassName: example4
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  21:31
 * String类判断操作--黑马
 */
public class example4 {
    public static void main(String[] args) {
       String s="String";
       String w="string";
        System.out.println("判断字符串是否以Str开头："+s.startsWith("Str"));

        System.out.println("判断字符串是否以ng结尾："+s.endsWith("ng"));

        System.out.println("判断字符串是否包含tri:"+s.contains("tri"));

        System.out.println("判断当前字符串内容是否为空："+s.isEmpty());



        System.out.println("判断两个字符串的内容是否相同："+s.equals(w));

    }
}
