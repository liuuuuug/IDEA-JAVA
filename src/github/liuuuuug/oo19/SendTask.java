package github.liuuuuug.oo19;

/**
 * @ClassName: SendTask
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  19:05
 * 快递任务
 */
public class SendTask {
    private String number;
    private double goodsWeight;

    public SendTask() {
        super();
    }

    public SendTask(String number, double goodsWeight) {
        super();
        this.number = number;
        this.goodsWeight = goodsWeight;
    }

    public void sendBefore() {
        System.out.println("订单开始处理，仓库查验中。。。");
        System.out.println("货物的重量：" + this.goodsWeight + "公斤");
        System.out.println("货物检验完毕，开始装填");
        System.out.println("装填完毕，准备发出");
        System.out.println("已经发出，快递单号为：" + this.number);
    }
    //发送货物

    public void send(Transportation t, GPS tool) {
        System.out.println("运货人" + t.getAdmin() + "正在驾驶编号为" + t.getNumber()
                + t.getModel() + "发送货物");
        t.transport();
        String showCoordinate = tool.showCoordinate();
        System.out.println("货物当前的坐标为" + showCoordinate);


    }

    public void setAfter(Transportation t) {
        System.out.println("货物运输任务已完成");
        System.out.println("送货人" + t.getAdmin() + "所驾驶的编号为" + t.getNumber() + "的"
                + t.getModel() + "已归还");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

}