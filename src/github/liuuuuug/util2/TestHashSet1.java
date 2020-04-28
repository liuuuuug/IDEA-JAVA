package github.liuuuuug.util2;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 21:07
 */
class Student{
    String id;
    String name;
    public Student(String id,String name){
        this.id=id;
        this.name=name;
    }
    //重写toString()方法
    @Override
    public String toString(){
        return id+":"+name;

    }
}
public class TestHashSet1 {
    public static void main(String[] args) {

        HashSet hs=new HashSet();

        Student stu1=new Student("1","jack");
        Student stu2=new Student("2","rose");
        Student stu3=new Student("2","rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);

        System.out.println(hs);

    }
}
