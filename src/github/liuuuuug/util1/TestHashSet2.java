package github.liuuuuug.util1;



import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-19
 * Time: 21:18
 */
class Student1{
    String id;
    String name;
    public Student1(String id,String name){
        this.id=id;
        this.name=name;
    }
    //重写toString()方法
    @Override
    public String toString(){
        return id+":"+name;

    }
    public int hashCode(){
        return id.hashCode();
    }
    //重写equals方法
    public boolean aquals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Student1)){
            return false;
        }
        //将对象强制转换Student1

        Student1 stu=(Student1)obj;

        boolean b= this.id.equals(stu.id);
        return b;
        //返回判断结果，结果为true说明是重复元素，舍弃：fash说明是新元素
    }
}
public class TestHashSet2 {


        public static void main(String[] args) {

            HashSet hs=new HashSet();

        Student1 stu1=new Student1("11","jack");
        Student1 stu2=new Student1("22","rose");
        Student1 stu3=new Student1("22","rose");

            System.out.println(stu1.hashCode());
            System.out.println(stu2.hashCode());
            System.out.println(stu3.hashCode());

            hs.add(stu1);
            hs.add(stu2);
            hs.add(stu3);

            System.out.println(hs);


    }

}
