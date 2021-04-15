package test11;

import java.util.*;
class Example3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int numble = st.countTokens();
        System.out.print(numble);
    }
}
