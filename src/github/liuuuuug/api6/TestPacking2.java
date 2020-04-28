package github.liuuuuug.api6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 19:07
 *包装类---parseInt方法
 * toString
 */
public class TestPacking2 {
    public static void main(String[] args) {
        int w=Integer.parseInt("20");
        int h=Integer.parseInt("10");
        for(int i=0;i<h;i++){

            StringBuilder sb = new StringBuilder();
            for(int j=0;j<w;j++){
                sb.append("6");

            }
           // System.out.println(sb);
            //或者
            System.out.println(sb.toString());
        }

    }
}
