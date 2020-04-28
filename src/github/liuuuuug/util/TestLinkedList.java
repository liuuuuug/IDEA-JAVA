package github.liuuuuug.util;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 15:35
 * LinkedList集合
 */
public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList link = new LinkedList();

        link.add("ssssss");
        link.add("sskoooo");
        link.add("duihjuih");
        link.add("disjjkfd");

        System.out.println(link);

        link.add(3,"pig");
        link.addFirst("kdfjdf");

        System.out.println(link);
        System.out.println("获取第一个元素"+link.getFirst());

        link.remove(3);
        link.removeFirst();
        System.out.println(link);



    }
}
