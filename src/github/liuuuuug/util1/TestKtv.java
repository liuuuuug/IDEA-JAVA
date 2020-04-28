package github.liuuuuug.util1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 19:08
 * ktv模拟点歌器
 * @author 33889
 */
public class TestKtv {
    public static void main(String[] args) {
//初始界面
        System.out.println("--------欢迎来到点歌系统-----");
        System.out.println("0.添加歌曲");
        System.out.println("1.将歌曲置顶");
        System.out.println("2.将歌曲前移一位");
        System.out.println("3.推出");

//创建储存用的集合
        LinkedList linkedList=new LinkedList();

//添加一部分歌曲至集合中
        addMusicList(linkedList);
        while (true){
            System.out.println("请输入数字");
            //获得键盘输入
            Scanner scan =new Scanner(System.in);
            int command=scan.nextInt();

            switch (command){
                case 0:
                    addMusic(linkedList);
                    break;
                case 1:
                    setTop(linkedList);
                    break;
                case 2:
                    break;
                case 3:
                    exit();
                    break;
                default:
                    System.out.println("------------------");
                    System.out.println("错误！！！");
                    System.out.println("请输入正确的数字");
                    break;

            }
            System.out.println("当前歌曲列表"+linkedList);

        }

    }

    private static void addMusicList(LinkedList linkedList) {
        linkedList.add("空城");
        linkedList.add("走着走着就散了");
        linkedList.add("种太阳");
        linkedList.add("龙卷风");

        System.out.println("初始化歌曲列表："+linkedList);
    }
    private static void  addMusic(LinkedList linkedList){
        System.out.println("请输入要添加歌曲的名称");
        String musicname=new Scanner(System.in).nextLine();
        linkedList.add(musicname);
        System.out.println("已添加歌曲"+musicname);
    }

    private static void setTop(LinkedList linkedList){

        System.out.println("请输入要置顶的歌曲名称：");
        String musicName=new Scanner(System.in).nextLine();
        int position=linkedList.indexOf(musicName);

        if(position<0){
            System.out.println("当前没有这首歌");
        }else{
            linkedList.remove(musicName);
            linkedList.addFirst(musicName);
        }
        System.out.println("已将歌曲"+musicName+"置顶");
    }
    private static void setBefore(LinkedList linkedList){
        System.out.println("请输入要前置的歌曲名称");
        String musicName=new Scanner(System.in).nextLine();
        int position=linkedList.indexOf(musicName);
        if(position<0){
            System.out.println("当前列表中没有输入的歌曲");
        }else if(position==0){
            System.out.println("当前歌曲已在最顶部");
        }else{
            linkedList.remove(musicName);
            linkedList.add(position -1,musicName);
        }
        System.out.println("已将歌曲"+musicName+"前置一位");
    }
    private static void exit(){
        System.out.println("---------退出---------");
        System.out.println("谢谢使用");
        System.exit(0);
    }

}

