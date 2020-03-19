package xyz.liuuuuug.bank;

/**
 * Created on 2020/3/19.
 *
 * @author liuuuuug
 */
public class Bank {
    static  String bankName;
    private String name;
    private String password;
    private double balance;
    private double turnover;

    //分别定义静态变量银行名称，储户姓名，密码，账户余额，交易额

    //静态方法，打印银行欢迎语句

    static void welcome(){
        System.out.println("欢迎来到"+bankName+"-------");

    }
    //构造方法开户

    public Bank(String name,String password,double turnover){

        //将变量赋值给成员变量

        this.name=name;
        this.password=password;
        this.turnover=turnover;
        this.balance=turnover - 10;
        System.out.println(name+"开户成功，账户余额"+balance);


    }

    //存款

    public  void deposit(double turnover){
        balance = balance+turnover;
        System.out.println(name+"您好，您的账户已存入"+turnover+"元"+"当前余额为："+balance+"元");
    }

      //取款

    public void withdrwal(String password,double turnover){
        //根据传入的变量与成员变量对比，判断密码是否正确

       if(this.password != password){
           System.out.println("密码错误");
           return;
       }

       //判断余额是否充足

            if(balance - turnover>0){
                balance = balance - turnover;
                System.out.println(name+"您好，您的账户被取走"+turnover+"元"+"当前余额为："+balance+"元");

            }else{
                System.out.println("对不起，您的余额不足");
            }

    }

    //静态方法，打印下次欢迎光临

    static  void welcomeNext(){
        System.out.println("请携带好随身物品，欢迎下次光临"+bankName+"--------");

    }
}
