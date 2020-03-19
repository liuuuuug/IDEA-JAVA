package gan;

/**
 * Created on 2020/3/17.
 *构造方法的重载和方法的重载没啥两样--尚学堂
 * @author liuuuuug
 *
 *
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }

    public User(int id, String name){
        super();
        this.id=id;
        this.name=name;

        //构造方法的第一局总是super()
        //this表示创建好的对象

    }
    //上面和下面的id遵循就近原则

    public User(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User(101 ,"则按");
        User u3=new User(100,"霍","12345");

    }




}
