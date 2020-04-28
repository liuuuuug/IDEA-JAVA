package github.liuuuuug.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-27
 * Time: 8:10
 * 从文件读取
 */
public class TestFileinputSteam {
    public static void main(String[] args) throws IOException {
//创建一个文件字节输入流
        FileInputStream in=new FileInputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io\\test.txt");

        //定义一个Int类型数量b，记住每一个字节

        int b=0;
        while (true){
            b=in.read();
            if(b==-1){
                break;
            }

            System.out.println(b);
        }
        in.close();

    }
}
