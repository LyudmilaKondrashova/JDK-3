package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2};
        Integer[] array4 = {1, 2, 4};
        System.out.print("Массив " + Arrays.toString(array1) + " и массив " + Arrays.toString(array2) + ": ");
        if (compareArrays(array1, array2) != null) {
            System.out.println(compareArrays(array1, array2));
        }
        System.out.print("Массив " + Arrays.toString(array1)+ " и массив " + Arrays.toString(array3) + ": ");
        if (compareArrays(array1, array3) != null) {
            System.out.println(compareArrays(array1, array3));
        }
        System.out.print("Массив " + Arrays.toString(array1) + " и массив " + Arrays.toString(array4) + ": ");
        if (compareArrays(array1, array4) != null) {
            System.out.println(compareArrays(array1, array4));
        }

        String[] arrayS1 = {"a", "b", "c"};
        String[] arrayS2 = {"a", "b"};
        String[] arrayS3 = {"a", "b", "D"};
        String[] arrayS4 = {"a", "b", "c"};
        System.out.print("Массив " + Arrays.toString(arrayS1) + " и массив " + Arrays.toString(arrayS2) + ": ");
        if (compareArrays(arrayS1, arrayS2) != null) {
            System.out.println(compareArrays(arrayS1, arrayS2));
        }
        System.out.print("Массив " + Arrays.toString(arrayS1)+ " и массив " + Arrays.toString(arrayS3) + ": ");
        if (compareArrays(arrayS1, arrayS3) != null) {
            System.out.println(compareArrays(arrayS1, arrayS3));
        }
        System.out.print("Массив " + Arrays.toString(arrayS1) + " и массив " + Arrays.toString(arrayS4) + ": ");
        if (compareArrays(arrayS1, arrayS4) != null) {
            System.out.println(compareArrays(arrayS1, arrayS4));
        }

    }

    public static <T> Boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Массивы имеют разную длину!");
            return null;
        }
        return Arrays.equals(arr1, arr2);
    }

}