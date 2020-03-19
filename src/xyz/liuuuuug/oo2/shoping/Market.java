package xyz.liuuuuug.oo2.shoping;

import java.util.Properties;

/**
 * Created on 2020/3/19.
 *超市类--黑🐎
 *
 * 先定义一个超市类
 * 描述超市的事务
 * 超市名字
 * 超市的仓库，储存的商品
 * 售货方法
 * @author liuuuuug
 */
public class Market {
    //超市名字

    private String marketName;
    private Product [] productArr;

    //超市仓库 储存商品  里面若干商品

    public String getMarketName(){
        return marketName;
    }
//this.用来区分成员变量和局部变量

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
    public Product[] getProductArr(){
        return productArr;
    }
    public void setProductArr(Product[] productArr){
        this.productArr=productArr;

    }
    public Product sell(String name){
        for(int i=0;i < productArr.length;i++){
            if(productArr[i].getProName() == name){
                return productArr[i];
            }
        }
        return null;
    }
}
