/**
 * while和do-while的差别
 */
public class Testwhile1 {
    public static void main(String[] args) {
        int a=0;
        while(a<0){
            System.out.println(a);
            a++;
        }//while循环：先判断再执行
        System.out.println("--------");
        a=0;
        do{
            System.out.println(a);
            a++;
        }while(a<0);//do-while循环：先执行再判断
    }
}
