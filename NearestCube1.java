package test11;

import java.util.Scanner;
import java.lang.*;

public class NearestCube1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double i = 0;

        if (keyboard.hasNextDouble()){
            i = keyboard.nextDouble();
            System.out.println("The nearest perfect cube to " + i + " is " + neCube(i));
        }
        else{
            System.out.println("Error: " + "\"" + keyboard.next() + "\"" + " is not a real number.");
            keyboard.close();
        }

    }

    public static int neCube(double i){

        int nextI = (int)Math.floor(Math.cbrt(i)) + 1;
        int beforeI = (int)Math.floor(Math.cbrt(i));
        double diff1 = nextI * nextI * nextI - i;
        double diff2 = i- beforeI * beforeI * beforeI;

        if(diff1 < diff2){
            return nextI * nextI * nextI;
        }
        else {
            return beforeI * beforeI * beforeI;
        }
    }
}


