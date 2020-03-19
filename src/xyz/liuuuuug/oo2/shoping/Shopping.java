package xyz.liuuuuug.oo2.shoping;

import java.sql.PreparedStatement;
import java.util.Map;

/**
 * Created on 2020/3/19.
 *
 * @author liuuuuug
 */
public class Shopping {
    public static void main (String[] args){

        //创建商品对象，给名字赋值

        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        Product p4=new Product();
        Product p5=new Product();
        p1.setProName("电视机");
        p2.setProName("猪肉");
        p3.setProName("电冰箱");
        p4.setProName("飞机");
        p5.setProName("大炮");


        //创建商品对象给名字赋值

        Market m=new Market();
        m.setMarketName("家乐福");
        m.setProductArr(new Product[] {p1,p2,p3,p4,p5});

        //创建人对象，给名字赋值

        Person p=new Person();
        p.setName("韩");

        //调用购物方法，指定超市和商品名，得到购物结果

        Product result = p.shopping(m,"大炮");

        //根据结果判断

        if(result !=null){
            System.out.println(p.getName()+"在"+m.getMarketName()+"买到了"+result.getProName());
        }else{
            System.out.println(p.getName()+"白跑了一趟，在"+m.getMarketName()+"白跑一趟");
        }

    }
}
