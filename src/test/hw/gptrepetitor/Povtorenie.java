package test.hw.gptrepetitor;

import java.util.Arrays;

public class Povtorenie {    

    public static void main(String[] args) {
        int[] arrya1 = null;
        int[] array2 = {};
        int[] array3 = {6, 8, 9, 1};
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};
        
        reverAndPrint(arrya1);
        reverAndPrint(array2);
        reverAndPrint(array3);
        reverAndPrint(array4);

    }
    
    private static void reverAndPrint(int[] array) {
        if (array == null) {
            System.out.println(" Массив равен null, реверс невозможен");
            return;
        }
        if (array.length == 0) {
            System.out.println(" Массив нулевой длины, вывод невозможен");
            return;
        }
        System.out.println(" До реверса: " + Arrays.toString(array));
        
        reverseArray(array);
        System.out.println(" После реверса: " + Arrays.toString(array));
    }
    
    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
            
        }
    }
    

}
