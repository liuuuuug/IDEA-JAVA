package gan2;

import gan1.TestThis;

/**
 * Created on 2020/3/19.
 *static关键字--尚学堂】
 *
 * @author liuuuuug
 */
public class TsetStatic {
    int id;
    String name;
    String pwd;

    static String company="啧啧";
    //静态常量

    public TsetStatic(int id,String name){
        this.id=id;
        this.name=name;

    }

    public void login(){
        printCompany();
        System.out.println(company);
        System.out.println("登录："+name);


    }
    public static void printCompany(){
        System.out.println(company);

    }

    public static void main(String[] args) {
        TsetStatic u =new TsetStatic(1001,"zhu");
        TsetStatic.printCompany();
        TsetStatic.company="你个猪";
        TsetStatic.printCompany();
    }

}
