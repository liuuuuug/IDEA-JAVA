package github.liuuuuug.oo7;

/**
 * @ClassName: Textextends
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/2  12:39
 * 继承--尚学堂
 */
public class Textextends {
    public static void main(String[] args) {
        Student s= new Student("zhu",90,"do no good");
        s.rest();
        s.study();
    }
}
class Person{
    String name;
    int hight;
    public void rest(){
        System.out.println("Take a break!");
    }
}
class Student extends Person{
    String major;
    public void study(){
        System.out.println("I am studying");
    }
    public Student(String name,int hight,String major){

        this.name=name;
        this.major=major;
        this.hight=hight;

        //此类继承父类的属性可以直接用
    }
}

