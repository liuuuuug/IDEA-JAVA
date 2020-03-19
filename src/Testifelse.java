/**
 * 测试if-else
 */

public class Testifelse {
    public static void main(String[] args) {
        //随机产生一个[0.0, 4.0)区间的半径，并根据半径求圆的面积和周长
         double r=4*Math.random();
         double area = Math.PI*Math.pow(r,2);   //Math.pow(r, 2)求半径r的平方
         double clrcle =2*Math.PI*r;


        System.out.println("+++++++++++++++++");
        System.out.println("半径为:"+r);
        System.out.println("面积为"+area);
        System.out.println("周长为:"+clrcle);

        if(area>=clrcle){
            System.out.println("面积大于周长");
        }else{
            System.out.println("周长大于面积");
        }
        System.out.println("++++++++++++++++++++");
    }

}
