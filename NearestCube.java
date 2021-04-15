package test11;

import java.util.Scanner;
import java.lang.*;

public class NearestCube {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double i = 0;
        String str = null;

        try {
            str = keyboard.nextLine();
            i = Double.parseDouble(str);
            System.out.println("The nearest perfect cube to " + i + " is " + neCube(i));
        }catch (NumberFormatException e){
            System.out.println("Error: " + "\"" + str + "\"" + " is not a real number.");
        }
        keyboard.close();

    }

    public static int neCube(double i) {

        int nextI = (int) Math.floor(Math.cbrt(i)) + 1;
        int beforeI = (int) Math.floor(Math.cbrt(i));
        double diff1 = nextI * nextI * nextI - i;
        double diff2 = i - beforeI * beforeI * beforeI;

        if (diff1 < diff2) {
            return nextI * nextI * nextI;
        } else {
            return beforeI * beforeI * beforeI;
        }
    }
}