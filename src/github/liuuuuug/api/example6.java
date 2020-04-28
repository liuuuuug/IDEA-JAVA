package github.liuuuuug.api;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-15
 * Time: 20:26
 * StringBuffer类的常用法--黑马
 * public StringBuffer()空参数的构造方法
 * public String Buffer（String data )创建带有内容的字符串缓冲区
 * 添加数据的方法
 * public StringBuffer append(String str) 向字符串缓冲区的末尾添加新数据，返回当前StringBuffer对象本身
 * public StringBuffer insert(int index,String str)向字符串缓冲区指定位置上，插入指定的数据
 * 删除的方法
 * public StringBuffer delete(int start,int end)删除字符串缓冲区指定范围内的数据
 * public StringBuffer deleteCharAt(int index)删除字符串缓冲区指定位置上的数据
 *public int length()获取字符串缓冲区的长度
 *
 *
 * public StringBuffer replace(int start,int end,String str)替换字符串缓冲区指定范围内的字符串
 *  public StringBuffer setCharAt(int index,char ch)替换字符串缓冲区指定的字符
 */
public class example6 {
    public static void main(String[] args) {
        System.out.println("1.添加---------------");
        add();
        System.out.println("2.删除+++++++++++++++");
        remove();
        System.out.println("3.修改===============");
        al();
    }




    public static void add(){
        //定义一个字符串缓冲区

        StringBuilder sb =new StringBuilder();


//像缓冲区添加指定字符
        sb.append("ahdhdudh");
        System.out.println("append添加数据后的结果："+sb);
//向缓冲区指定位置插入字符串
        sb.insert(2,"3373");
        System.out.println("insert插入数据后的结果："+sb);



    }
    private static void remove() {
        //定义一个字符串缓冲区
        StringBuilder sb=new StringBuilder("jdfsiojdfif");

        //删除字符串缓冲区指定范围内的数据

        sb.delete(1,5);
        System.out.println("删除指定范围数据后的结果："+sb);

        //删除字符串缓冲区指定位置上字符
        sb.deleteCharAt(2);
        System.out.println("删除指定位置数据后的结果："+sb);

        //清空字符串缓冲区

        sb.delete(0,sb.length());
        System.out.println("清空缓冲区后的结果："+sb);
    }
    private static void al() {

        StringBuilder sb=new StringBuilder("dhjsuhd");

        //修改指定位置上的字符
        sb.setCharAt(1,'t');
        System.out.println("修改指定位置后的结果："+sb);

        sb.replace(1,3,"jj");
        System.out.println("替换指定范围字符串的后果"+sb);


        //字符串缓冲区数据反转后的结果
        System.out.println("反转后的结果："+sb.reverse());
    }
}
