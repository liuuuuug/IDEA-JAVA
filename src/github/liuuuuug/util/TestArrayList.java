package github.liuuuuug.util;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 15:23
 * ArrayList--黑马
 */
public class TestArrayList {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        //向集合添加元素

        list.add("ddsdfdsf");
        list.add("ddffdfdf");
        list.add("ddffdsaaw");
        list.add("dfgdgrhhh");

        System.out.println(list);

        System.out.println("集合的长度是："+list.size());
        System.out.println("第二个元素是："+list.get(2));

        //只有四个元素，多打一个数，会使交界超标

       // System.out.println("第五个元素是："+list.get(4));
    }
}
