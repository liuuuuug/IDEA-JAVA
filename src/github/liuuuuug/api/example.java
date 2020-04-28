package github.liuuuuug.api;

/**
 * @ClassName: example
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  20:37
 * String类---黑马
 *
 */
public class example {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2=new String();
        String str3=new String("sbdf");
        char[] charArray=new char[]{
                'Y','l','l'
        };
        String str4=new String(charArray);
        System.out.println(str1);
        System.out.println("a"+str2+"b");
        System.out.println(str3);
        System.out.println(str4);
    }
}
