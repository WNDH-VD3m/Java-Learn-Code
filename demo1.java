package test11;
import java.util.Scanner;
import java.lang.*;

public class demo1 {

    public static void main(String[] args){
        perCube();
    }
    public static int perCube(){
        Scanner scan = new Scanner(System.in);
        double i = 0;
        System.out.println("Please enter a number: ");

        if (scan.hasNextDouble()){
            i = scan.nextDouble();
            System.out.println("The number is " + i);

            int nextI = (int)Math.floor(Math.cbrt(i)) + 1;
            int beforeI = (int)Math.floor(Math.cbrt(i));

            double diff1 = nextI * nextI * nextI - i;
            double diff2 = i- beforeI * beforeI * beforeI;

            if(diff1 < diff2){
                System.out.println("The nearest perfect cube to " + i + " is " + nextI * nextI * nextI);
                return nextI * nextI * nextI;
            }
            else {
                System.out.println("The nearest perfect cube to " + i + " is " + beforeI * beforeI * beforeI);
                return beforeI * beforeI * beforeI;
            }
        }

        else{
            System.out.println("Error: " + "\"" + scan.next() + "\"" + " is not a real number.");
        }
        return 0;
    }
}


