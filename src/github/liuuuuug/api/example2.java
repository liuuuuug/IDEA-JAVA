package github.liuuuuug.api;

/**
 * @ClassName: example2
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  21:05
 * String类的转换操作
 * 字符串转换字符数组
 */
public class example2 {
    public static void main(String[] args) {
        String s="asadddf";

        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(i== charArray.length -1){
                System.out.print(charArray[i]);
            }else{
                System.out.print(charArray[i]+",");
            }
        }
        System.out.println("将int值转换Spring类型的后果："+String.valueOf(89));
        System.out.println("将字符串转换为大写字母："+s.toUpperCase());
    }
}
