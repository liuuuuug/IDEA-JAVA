package gan1;



/**
 * Created on 2020/3/17.
 *this表示当前对象 --尚学堂
 * @author liuuuuug
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }
    public User(int id,String name){
        System.out.println("正在初始化已经创建好的对象："+this);
        this.id=id;
        //不写this，无法区分局部变量Id和成员变量id
        this.name=name;

    }
    public void login(){
        System.out.println(this.name+"要登陆！");
    }

    public static void main(String[] args) {
        User u3=new User(101,"刘恩光");
        System.out.println("打印刘恩光对象"+u3);
        u3.login();
    }




}
