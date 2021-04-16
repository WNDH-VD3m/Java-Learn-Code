package test11;
import java.util.*;

public class 迭代 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Yeah");

        //方法一: 用For-each遍历List
        for (String str : list){
            System.out.println(str);
        }

        System.out.println();

        //方法二: 把链表当成数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0 ; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        System.out.println();

        //方法三: 使用迭代器进行相关的遍历
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }

}
