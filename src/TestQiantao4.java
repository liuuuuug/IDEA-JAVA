/**
 * 嵌套循环
 * 二战99乘法表
 */
public class TestQiantao4 {
    public static void main(String[] args) {
        for(int i=1;i<=99;i++){
            for(int m=1;m<=i;m++){
                System.out.print(m+"*"+i+"="+(m*i)+"\t");
            }
            System.out.println();
        }
    }
}
