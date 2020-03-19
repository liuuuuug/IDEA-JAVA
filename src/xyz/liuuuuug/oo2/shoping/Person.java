package xyz.liuuuuug.oo2.shoping;

/**
 * Created on 2020/3/19.
 *定义一个购物者
 * @author liuuuuug
 */
public class Person {
    //定义一个人名

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    //购物，指定去哪个超市，商品名
    Product shopping(Market market,String name){
        //调用超市的卖货方法，指定商品名，把卖出的结果返回
        return market.sell(name);
    }
}
