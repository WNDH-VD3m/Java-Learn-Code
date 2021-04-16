package test11;
import java.util.ArrayList;
import java.util.Iterator;

public class IterTest1 {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Taobao");
        sites.add("Tianmao");
        sites.add("Baidu");

        System.out.println(sites);

        Iterator<String> it = sites.iterator();


        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
