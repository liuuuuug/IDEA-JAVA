/**
 * Use:
 * author:liuuuuug
 * Time:2020.
 * or:continue退出本次循环，还可以继续
 */
public class Testcontinue {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<150;i++){

            if(i%3 ==0){
                continue;//如果能不在循环下面
            }
            System.out.print(i+",");
            count++;
            if(count%5 ==0){
                System.out.println();
                count =0;
            }
        }
    }
}
