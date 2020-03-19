package xyz.liuuuuug.oo1;

/**
 * Created on 2020/3/19.
 *类的封装---黑马
 * @author liuuuuug
 */
class Student{
    private String name;
    private int age;
    //加private将name和age私有化
    //下面的公有的方法阅读间接访问类中的属性getxx方法和setxx方法

    public String getName(){
        return name;
    }
    public void setName(String stuName){
        name= stuName;
    }
    public int getAge(){
       return age;
    }
    public void setAge(int stuAge){
        if(stuAge<0){
            System.out.println("输入不合法");
        }else{
            age=stuAge;
        }
        //使用if使之符合生活
    }
    public void introduce(){
        System.out.println("大家好，我叫"+name +","+"我今年"+age+"岁");
    }

}
public class Example04 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("主打帅");
        stu.setAge(9000);
        stu.introduce();
    }
}
