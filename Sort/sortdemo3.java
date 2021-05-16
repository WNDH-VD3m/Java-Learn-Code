package 排序;

import java.util.Arrays;

public class sortdemo3 {

    public static void main(String[] args) {

        int[] array = {10, 2, 30, 219, 29, 93, 8};
        Arrays.sort(array); //先升序排好
        int[] descArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            descArray[i] = array[array.length - i -1];
        }

        System.out.println("倒叙排序");
        for (int e : descArray){
            System.out.println(e);
        }
    }

}
