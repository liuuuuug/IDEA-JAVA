package xyz.liuuuuug.bank;

/**
 * Created on 2020/3/20.
 *
 * @author liuuuuug
 */
public class Trade {
    public static void main(String[] args) {
        //定义一家银行(给静态变量赋值，可以直接使用类名访问)

        Bank.bankName="人民银行";

        //调用静态方法。银行欢迎语句

        Bank.welcome();

        //通过构造方法开户

        Bank bank =new Bank("阿朱","880088",1099);
        //存款
        bank.deposit(44444);

        //错误密码
        bank.withdrwal("77778",900);

        //余额不足
        bank.withdrwal("880088",5999999);

        //取款成功

        bank.withdrwal("880088",5);
        //调用静态方法，打印道别语句

        Bank.welcomeNext();

    }
}
