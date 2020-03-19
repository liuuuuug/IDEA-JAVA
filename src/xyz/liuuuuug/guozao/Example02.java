package xyz.liuuuuug.guozao;

/**
 * Created on 2020/3/19.
 *有参的构造方法--黑马
 * @author liuuuuug
 */
class Person1{
    int age;

    //定义有参的构造方法

    public Person1(int a){
        age=a;
        //给age赋值
    }
    public  void speak(){
        System.out.println("今年我已经"+age+"岁了！");
    }

}
public class Example02 {
    public static void main(String[] args) {
            Person1 p1=new Person1(90);
            //上面调用了赋值后的

            p1.speak();
        }


}
