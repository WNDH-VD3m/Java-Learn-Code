package test11;
import java.util.*;

public class stackTest {
    static void showPush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showPop(Stack<Integer> st){
        System.out.println("Pop -> ");
        Integer a = (Integer)st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        System.out.println("stack: " + st);
        showPush(st,32);
        showPush(st,18);
        showPush(st,12);
        showPop(st);
        showPop(st);
        showPop(st);
        try{
            showPop(st);
        }
        catch (EmptyStackException e){
            System.out.println("Empty stack");
        }
    }



}
