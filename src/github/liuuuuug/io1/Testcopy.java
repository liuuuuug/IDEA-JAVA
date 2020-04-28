package github.liuuuuug.io1;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-27
 * Time: 9:02
 * 文件拷贝
 */
public class Testcopy {
    public static void main(String[] args) throws IOException {
//创建一个字节输入流，用来读取sourse目录的mp3
        InputStream in=new FileInputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io1\\source\\猪之歌.MP3");
        //创建输出流，用于数据写入target文件加

        OutputStream out=new FileOutputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io1\\target\\猪之歌.MP3");
//获取时间
        long begintime= System.currentTimeMillis();
        //读取数据
        int len;
        while((len=in.read())!=-1){

            out.write(len);

        }

        long endtime = System.currentTimeMillis();
        System.out.println("拷贝的时间为" +(endtime-begintime) + "s");

        in.close();
        out.close();

    }
}
