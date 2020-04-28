package github.liuuuuug.io2;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-27
 * Time: 9:26
 * 用缓冲区进行文件拷贝
 */
public class Testcopy2 {
    public static void main(String[] args) throws IOException {
//创建一个字节输入流，用于读取当前目录下的sourse文件的MP3文件
        InputStream in=new FileInputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io2\\sourse\\你是猪.MP3");

//创建一个字节输入流，用于写入
        OutputStream out =new FileOutputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io2\\trgage\\你是猪.MP3");

//读取数据
        byte[] buff=new byte[1024];
        //定义int类型len，记住读取读入缓冲区的字节数


        int len;
//开始时间
        long begintime=System.currentTimeMillis();

        while ((len = in.read(buff)) !=-1){
            out.write(buff,0,len);
        }
        //结束时间
        long endtime=System.currentTimeMillis();

        System.out.println("花费时间"+(endtime-begintime)+"s");

        in.close();
        out.close();
    }
}
