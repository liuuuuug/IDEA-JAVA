/**
 * Use:Java练习
 *
 * @author:liuuuuug
 * or:方法联系
 * 黑马+尚学堂
 * time:2020.3.8
 */
public class TestMethod3 {
    public static void main(String[] args) {
        //通过对象调用的普通方法
        TestMethod3 tm = new TestMethod3();
        tm.printSxt();

        tm.add(22,33,33);

        int c=tm.add(22,22)+10000;
        System.out.println(c);

    }
    void printSxt(){
        System.out.println("zeze");
        System.out.println("hehe");
        System.out.println("haha");
    }
    void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);

    }
    int add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }
}
