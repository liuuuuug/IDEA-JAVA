package github.liuuuuug.api7;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 33889
 * Date: 2020-04-16
 * Time: 19:16
 * 字符串排序程序
 */
public class TestString {
    public static void main(String[] args) {

        String num="20 89 0 99 -88 88 0 22";
        System.out.println(num);
        num =sortStringNumber(num);
        System.out.println(num);


    }
    //排序

    public static String sortStringNumber(String numStr){
        //字符串————>字符串数组--int数组---排序
        String[] str_arr=numStr.split("  ");

        int[] num_arr = toTntArray(str_arr);

        Arrays.sort(num_arr);
        String temp=arrayToString(num_arr);


        return temp;
    }
    public static String arrayToString(int[] num_arr){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<num_arr.length;i++){
            if(i==num_arr.length -1){
                sb.append(num_arr[i]);
            }else{
                sb.append(num_arr[i]+" ");
            }

        }
        return sb.toString();
    }
    public static int[] toTntArray(String[] str_arr) {
        //创建int数组
        int[] arr=new int[str_arr.length];

        for(int i=0;i<str_arr.length;i++){

            arr[i]=Integer.parseInt(str_arr[i]);

        }
        return arr;
    }
}
