package github.liuuuuug.oo6;

/**
 * @ClassName: Mic
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/30  12:48
 */
public class Mic implements USB{

    public void turnOn() {
        System.out.println("麦克风打开了了");
    }


    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
