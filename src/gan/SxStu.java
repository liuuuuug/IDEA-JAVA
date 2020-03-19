package gan;

/**
 * Created on 2020/3/15.
 *定义一个人学生类+高级
 * @author liuuuuug
 */
public class SxStu {
    int id;
    String name;
    int age;

    Computer comp;

    //定义一个方法

    void study(){
        System.out.println("我再认真学习，用的机器："+comp.brand);
    }

    void play(){
        System.out.println("我在玩王者");
    }

    //main是方法程序的入口

    public static void main(String[] args) {
        //创建一个对象
        SxStu stu=new SxStu();

        stu.play();
        stu.id=1001;
        stu.age=18;
        stu.name="刘恩光";

        Computer c1=new Computer();
        c1.brand="神舟";

        stu.comp=c1;

        stu.play();
        stu.study();
    }
}
class Computer{
    String brand;
}


