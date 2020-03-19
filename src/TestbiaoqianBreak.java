/**
 * Use:
 * author:liuuuuug
 * Time:2020.
 * or
 */
public class TestbiaoqianBreak {
    public static void main(String[] args) {
//打印101-150之间所有的质数    外部循环outer
        outer: for(int i=101;i<150;i++){
           for(int j=2;j < i / 2;j++){
               if(i%j ==0){
                   continue outer;//跳到外部循环
               }
           }
            System.out.print(i+"  ");

        }

    }
}
