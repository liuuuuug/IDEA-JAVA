package github.liuuuuug.oo1;

/**
 * @ClassName: TestConstructor2
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/29  19:46
 * &#x6709;&#x53c2;&#x7684;&#x6784;&#x9020;&#x65b9;&#x6cd5;--&#x9ed1;&#x9a6c;
 */
class   Person2{
    private int age;
    public Person2(int a){
        age=a;
    }

    public void speak(){
        System.out.println("我今年已经"+age+"岁了");
    }
}
public class TestConstructor2 {
        public static void main(String[] args) {
        Person2 p=new Person2(90);
        p.speak();
    }

}
