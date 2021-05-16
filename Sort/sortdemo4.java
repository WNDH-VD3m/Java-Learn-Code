package 排序;

import java.util.*;

public class sortdemo4 {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10,2,3,12,9,7));
        Collections.sort(list);
        System.out.println("集合正序排序");
        for(Integer e : list){
            System.out.println(e);
        }

        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        Collections.sort(list, reverseComparator);
        System.out.println("集合倒叙排序");
        for (Integer num : list){
            System.out.println(num);
        }
    }

}
