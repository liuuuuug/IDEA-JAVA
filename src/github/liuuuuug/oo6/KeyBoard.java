package github.liuuuuug.oo6;

/**
        * @ClassName: KeyBoard
        * @Description: TODO
        * @author: liuuuuug
        * @date: 2020/3/30  12:46
        */
public class KeyBoard implements  USB{

    public void turnOn() {
        System.out.println("键盘启动了");

    }

    public void turnOff(){
        System.out.println("键盘关闭了");
    }
}
