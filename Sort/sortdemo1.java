package 排序;

import java.util.Arrays;

public class sortdemo1 {
    public static void main(String[] args){
        int[] array = {10,2,30,219,29,93,8};
        System.out.println("升序排序：");
        Arrays.sort(array);
        for(int e : array){
            System.out.println(e);
        }
    }
}
