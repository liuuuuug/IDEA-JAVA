package github.liuuuuug.oo6;

/**
 * @ClassName: Task01Test
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/30  12:58
 */
public class Task01Test {
    public static void main(String[] args){

        Computer c=new Computer();

        c.add(new Mouse());
        c.add(new Mic());
        c.add(new KeyBoard());
        c.powerOn();
        System.out.println();
        c.powerOff();
    }
}
