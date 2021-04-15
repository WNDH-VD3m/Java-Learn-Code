package test11;

import java.util.*;

public class Sentence {

    public static void main(String[] args){
        int letters = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a sentence.");
        String str = keyboard.nextLine();
        System.out.println("You typed: " + "\""  + str + "\"");

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                letters ++;
            }
        }
        StringTokenizer st = new StringTokenizer(str," ");
        int words = st.countTokens();
        System.out.println("Your sentence contained " + words + " words and " + letters + " letters.");
    }
}


