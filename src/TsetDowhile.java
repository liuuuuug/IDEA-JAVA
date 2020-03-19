/**
 * 测试do-while
 *
 */
public class TsetDowhile {
    public static void main(String[] args) {
       int i=0;
        int sum =0;
       do {
           sum += i;//等价于sum=sum+i
           i++;

       }while(i<=100);
        System.out.println("sum="+sum);

    }

}
