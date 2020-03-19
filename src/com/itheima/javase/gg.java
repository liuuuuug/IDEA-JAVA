package com.itheima.javase;

/**
 * Use:Java练习
 *
 * @author:liuuuuug or:
 * <p>
 * time:2020.3.
 */
public class gg {

    public static void sum(int a, int b) {
        System.out.println("int:" + (a + b));
    }

    public static void sum(int a, float b) {
        System.out.println("float:" + (a + b));
    }

    public static void sum(int a, double b) {
        System.out.println("double:" + (a + b));
    }

    public static void main(String[] args) {
        int a = 10;
        long b = 20;
        sum(a, b);

    }
}