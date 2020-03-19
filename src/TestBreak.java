/**
 * break测试
 * break强制退出不在循环
 *
 *
 */
public class TestBreak {
    public static void main(String[] args) {
       int total =0;
        System.out.println("zeze");
        while(true){
            total++;
            int i=(int)Math.round(100*Math.random());
            System.out.println(i);
            if(i==88){
                break;
            }
        }
        System.out.print("Game over,used"+total+"times.");


    }
}
