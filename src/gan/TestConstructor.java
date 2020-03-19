package gan;

/**
 * Created on 2020/3/17.
 *构造方法--尚学堂
 * @author liuuuuug
 */

class Point{
    double x,y;

    //构造方法  构造方法名必须和类名保持一致

    public Point(double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));

    }
}
//上下两个P不一样，方法不同


public class TestConstructor {
    public static void main(String[] args) {
        Point p=new Point(3.0,4.0);
        Point origin =new Point(0.0,0.0);
        System.out.println(p.getDistance(origin));
    }
}
