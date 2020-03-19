import java.sql.SQLOutput;

/**
 * 测试if
 */
public class Testif {
    public static void main(String[] args) {
      int i = (int)(6*Math.random())+1;
      int j = (int)(6*Math.random())+1;
      int k = (int)(6*Math.random())+1;//转化为整数，6乘以1——0之间的数

        int count = i+j+k;//三次相加进行if

        if(count>15){
            System.out.println("huo,今天手气不错");
        }
        if(count>=10&&count<=15){
            System.out.println("今天的手气一般");
        }
        if(count<10){
            System.out.println("不要用jio来测试");
        }
        System.out.println("得了"+count+"分");

    }



}

