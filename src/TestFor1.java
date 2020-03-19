/**
 * for测试
 * 逗号运算符
 *
 *       1. 无论在初始化还是在步进部分，语句都是顺序执行的。
 *
 *       2. 尽管初始化部分可设置任意数量的定义，但都属于同一类型。
 *
 *       3. 约定:只在for语句的控制表达式中写入与循环变量初始化，条件判断和迭代因子相关的表达式。
 *
 *       初始化部分、条件判断部分和迭代因子可以为空语句，但必须以“;”分开，
 */
public class TestFor1 {
    public static void main(String[] args) {
        for(int i=1,j=i+10;i<5;i++,j=i*2){
            System.out.println("i="+i+"j="+j);
        }
    }
}
