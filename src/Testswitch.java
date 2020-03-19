/**
 * 测试switch
 * 表达式：
 * switch (表达式) {
 * case 值1:
 * 语句序列1;
 * [break];
 * case 值2:
 *  语句序列2;
 * [break];
 *      … … …      … …
 * [default:
 *  默认语句;]
 *  //从break出来
 */
public class Testswitch {
    public static void main(String[] args) {
        char c ='a';
        int rand =(int)(26*Math.random());
        char c2 = (char)(c+rand);
        System.out.println(c2+":");
        switch(c2){
            case 'a':
            case 'e':
            case'i':
            case'o':
            case'u':
                System.out.println("元音");
                break;
            case 'y':
            case'w':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }

    }
}
