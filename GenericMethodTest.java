package test5;

public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray){

        for(E element : inputArray){
            System.out.printf("%s",element);
        }
    }

    public static void main(String args[]){
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {3.1, 2.3, 1.2};
        Character[] charArray = {'H','E','L','L','O'};
        System.out.println("整型数组元素为:" );
        printArray(intArray);

        System.out.println("\n字符型数组元素为:");
        printArray(charArray);
    }





}
