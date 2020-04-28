package github.liuuuuug.oo8;

/**
 * @ClassName: TestOverride
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/2  18:41
 * 方法的重写---尚学堂
 */
public class TestOverride {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        Vehicle v2=new Horse();
        Vehicle v3=new Plane();
        v1.run();
        v2.run();
        v3.run();
        v2.stop();
        v3.stop();

    }

}
class Vehicle{
    public void run(){
        System.out.println("run...");
    }
    public void stop(){
        System.out.println("Stop motion");
    }
}
class Horse extends Vehicle{
    @Override
    public void run(){
        System.out.println("Four Hoofs Fly,de~de~de~");
    }
}
class Plane extends Vehicle{
    @Override
    public void run(){
        System.out.println("Flying in the sky");
    }
    @Override
    public void stop(){
        System.out.println("About to crash");
    }
}
