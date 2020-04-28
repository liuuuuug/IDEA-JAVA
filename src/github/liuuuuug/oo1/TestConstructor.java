package github.liuuuuug.oo1;

/**
 * @ClassName: TestConstructor
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/3/29  14:00
 * 尚学堂--构造器（构造方法）
 */
class Point{
    double x,y;
    public Point(double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}
public class TestConstructor {
    public static void main(String[] args) {
        Point p=new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(p.getDistance(origin));
    }

}
