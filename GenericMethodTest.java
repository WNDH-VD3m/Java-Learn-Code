package test11;

public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s " , element);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.2,3.2,5.7,5.9};
        Character[] charArray = {'H','E','L','L','O'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }

}
