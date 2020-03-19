/**
 * 对if-else if-else的练习
 */
public class Testifelseifelse1 {
    public static void main(String[] args) {
        int s= (int)(Math.random());//强制类型转化
        System.out.println("成绩是:"+s+"水平在：");
        if(s>85){
            System.out.println("等级A");
        }else if(s>70){
            System.out.println("等级B");
        }else if(s>60){
            System.out.println("等级C");
        }else{
            System.out.println("等级D");
        }
    }
}
