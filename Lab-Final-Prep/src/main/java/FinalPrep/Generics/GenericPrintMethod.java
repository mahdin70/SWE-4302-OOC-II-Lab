package FinalPrep.Generics;

public class GenericPrintMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        printArray(intArray);
        printArray(charArray);
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
