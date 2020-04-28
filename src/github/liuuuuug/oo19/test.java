package github.liuuuuug.oo19;

/**
 * @ClassName: test
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  20:05
 */
public class test {
    public static void main(String[] args) {

        SendTask task = new SendTask("hhh", 78888);
        task.sendBefore();
        System.out.println("---------------");

        ZTransportation t = new ZTransportation("z0000", "大卡车", "老狗");
        Phone p = new Phone();

        task.send(t, p);
        System.out.println("-----------------");
        task.setAfter(t);
    }
}
