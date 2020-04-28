package github.liuuuuug.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-27
 * Time: 8:40
 * 使用fileoutputstream加数据再次加入
 */
public class TestFileoutputstream1 {
    public static void main(String[] args) throws Exception {

        OutputStream out=new FileOutputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io\\test.txt",true);


        String str1="欢迎您";

        byte[] d=str1.getBytes();
        for(int i=0;i<d.length;i++){
            out.write(d[i]);
        }
        out.close();
    }
}
