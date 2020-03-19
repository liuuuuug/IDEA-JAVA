/**
 * Use:
 *
 * @author:liuuuuug
 * or:测试方法的用法
 *
 * 尚学堂+黑马
 *
 *
 * time:2020.
 */
    public class TestMethod {
    public static void main(String[] args) {
        printRen(3, 5);
        printRen(10, 9);

    }

    public static void printRen(int h, int m) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }


}