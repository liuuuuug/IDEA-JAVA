package github.liuuuuug.io4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-28
 * Time: 10:52
 * 使用字符输入流File Reader读文件的字符
 */
public class TestFileReader {
    public static void main(String[] args) throws IOException {
//创建一个FileReader对象，用来读取文件中的字符
        FileReader reader=new FileReader("test.txt");

        int ch;

        while ((ch =reader.read() ) !=-1){

            System.out.println((char)ch);

        }
    }
}
