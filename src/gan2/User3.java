package gan2;

/**
 * Created on 2020/3/19.
 *static初始化块--静态--尚学堂
 * @author liuuuuug
 */
public class User3 {
    int id;
    String name;
    String pwd;
    static String company;

    //分别是id，账户名，密码，公司名称。

    static{
        System.out.println("执行类的初始化工作...");
        company="啧啧";
        printCompany();
    }
    //static 这是一个语句块

    public static void printCompany(){
        System.out.println(company);

    }

    public static void main(String[] args) {
        User3 u3=new User3();
    }


}
