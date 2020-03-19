package gan1;

/**
 * Created on 2020/3/19.
 *this()diaoy
 * @author liuuuuug
 */
public class TestThis {
    int a,b,c;

    TestThis(){
        System.out.println("正要初始化一个Hello对象...");
    }
    TestThis(int a,int b){
        this();
        a=a;
        this.a=a;
        this.b=b;
    }
    TestThis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }

    void sing(){

    }
    void eat(){
        this.sing();
        System.out.println("你妈喊你回家吃饭");
    }

    public static void main(String[] args) {
        TestThis hi=new TestThis(2,3);
        hi.eat();
    }






}
