package github.liuuuuug.oo19;

/**
 * @ClassName: ZTransportation
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  19:42
 * 专用的运输车类
 */
public class ZTransportation extends Transportation implements Careable{

    @Override
    public void transport() {
        System.out.println("运输中。。。");
    }

    public ZTransportation() {
    }

    public ZTransportation(String number, String model, String admin) {
        super(number, model, admin);
    }

    @Override
    public void upKeep() {
        System.out.println("货物运输车辆保养完毕");
    }
}
