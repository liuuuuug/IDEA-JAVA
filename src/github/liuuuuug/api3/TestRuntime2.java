package github.liuuuuug.api3;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 14:53
 */
public class TestRuntime2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime rt2=Runtime.getRuntime();

        Process process=rt2.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
    }
}
