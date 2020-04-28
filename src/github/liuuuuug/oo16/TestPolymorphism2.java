package github.liuuuuug.oo16;

/**
 * @ClassName: TestPolymorphism2
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  16:58
 */
interface Animal{
    public abstract void shout();
}
class Cat implements Animal {

    @Override
    public void shout() {
        System.out.println("miao~miao~miao~");
    }
    public void sleep(){
        System.out.println("猫谁叫~");
    }
}
class Dog implements Animal{

    @Override
    public void shout() {
        System.out.println("汪~wang~wang~");
    }
}
public class TestPolymorphism2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        animalShout(dog);

    }
    //

    public static void animalShout(Animal animal){
        //对传递的参数animal进行判断，如果是Cat对象，强制转成Cat类
        if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.shout();
            cat.sleep();
        }else{
            System.out.println("this animal is not cat");
        }

    }
}

