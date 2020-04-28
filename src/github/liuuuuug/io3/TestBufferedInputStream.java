package github.liuuuuug.io3;

import java.io.*;
import java.lang.management.BufferPoolMXBean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-27
 * Time: 10:11
 * 缓冲流---BufferedInputStream--BufferedOutputStream--用法
 *
 */
public class TestBufferedInputStream {
    public static void main(String[] args) throws IOException {
//创建一个缓冲区的输入流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io3\\src.txt"));

        //创建缓冲区输出流

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io3\\des.txt"));

        int len;
        while ((len=bis.read()) !=-1){
//写入数据
            bos.write(len);

        }
        //关闭流

        bis.close();
        bos.close();
    }
}
