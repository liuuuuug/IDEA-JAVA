/**
 * 测试for
 *
 */
public class TestFor {
    public static void main(String[] args) {
       int sum=0;
       for(int i=0;i<=100;i++){
           sum +=i;
       }
        System.out.println("sum="+sum);

       for(int i=9;i>0;i--){
           System.out.println(i+"、");
       }
        System.out.println();

       for(int i=90;i>0;i-=3){
           System.out.println(i+"、");

       }
        System.out.println();



    }
}
