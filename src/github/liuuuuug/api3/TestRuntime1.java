package github.liuuuuug.api3;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 14:41
 * Runtime类对象
 */
public class TestRuntime1 {
    public static void main(String[] args) throws IOException {

        Runtime rt1=Runtime.getRuntime();
        rt1.exec("notepad.exe");
    }
}
