package 排序;

import java.util.Arrays;

public class sortdemo2 {

    public static void main(String[] args){

        int[] array = {10,2,30,219,29,93,8};
        Arrays.sort(array); //先升序排好
        System.out.println("倒叙排序");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

}
