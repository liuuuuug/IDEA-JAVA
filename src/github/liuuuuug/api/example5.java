package github.liuuuuug.api;

/**
 * @ClassName: example5
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  21:48
 * String类的截取与分割操作
 */
public class example5 {
    public static void main(String[] args) {
        String l="羽毛球-篮球-乒乓球";


        System.out.println("从第五个字符开始截取到末尾的结果："+l.substring(4));

        System.out.println("从第五个字符开始截取到第六个字符结束的结果："+l.substring(4,6));

        System.out.println("------分割-------");
        String[] strArray1=l.split("-");
        for (int i=0;i<strArray1.length;i++){
            if(i == strArray1.length -1){
                System.out.println(strArray1[i]);
            }else{
                System.out.println(strArray1[i]+",");
            }
        }

    }
}
