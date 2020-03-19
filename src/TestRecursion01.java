/**
 * Use:Java练习
 *
 * @author:liuuuuug
 * or:递归：我调用我自己
 *
 * 尚学堂
 * time:2020.3.8
 */
public class TestRecursion01 {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果:%s%n", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n", d2-d1);
    }//耗时：32ms
    /** 求阶乘的方法*/
    static long  factorial(int n){
        if(n==1){
            //递归头
            return 1;
        }else{//递归体
            return n*factorial(n-1);//n! = n * (n-1)!
        }

    }
}
