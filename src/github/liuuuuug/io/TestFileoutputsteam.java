package github.liuuuuug.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-27
 * Time: 8:30
 */
public class TestFileoutputsteam {
    public static void main(String[] args) throws IOException {

        FileOutputStream out=new FileOutputStream("D:\\Mypro02\\src\\github\\liuuuuug\\io\\test.txt");

        String str="刘";

        byte[] c=str.getBytes();


        for (int i = 0; i<c.length; i++){
            out.write(c[i]);

        }
        out.close();
    }
}
