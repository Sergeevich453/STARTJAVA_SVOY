package test.hw.gptrepetitor;

import java.util.Arrays;

public class Povtorenie {
    public static int[] arrya1 = null;
    public static int[] array2 = {};
    public static int[] array3 = {6, 8, 9, 1};
    public static int[] array4 = {13, 8, 5, 3, 2, 1, 1};

    public static void main(String[] args) {        
        reverAndPrint(arrya1);
        reverAndPrint(array2);
        reverAndPrint(array3);
        reverAndPrint(array4);
        //2
        System.out.println("\nЗадача №2\n");
        calculateAndPrintFactorial();
        calculateAndPrintFactorial((int[]) null);
        calculateAndPrintFactorial(8, 0, 9);
        calculateAndPrintFactorial(-3, 1, 7, 13);
        calculateAndPrintFactorial(-22, 0);
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
    //2
    private static void calculateAndPrintFactorial(int... numbers) {
        if (numbers == null) {
            System.out.println(" Ошибка: массив равен null, обработка невозможна");
            return;
        }
        
        if (numbers.length == 0) {
            System.out.println(" Ошибка: массив нулевой длины, обработка невозможна");
            return;
        }
        
        System.out.println(" Выходные данные: " + Arrays.toString(numbers));
        for (int number: numbers) {
            if (number < 0) {
                System.out.println(" Ошибка: факториал " + number + "! не определен");
            } else {
                String factorialResult = factorialDateils(number);
                System.out.println(factorialResult);
            }
        }
        System.out.println();
    }
    
    private static String factorialDateils(int number) {
        if (number == 0 || number == 1) {
            return number + "! = 1";
        }
        
        StringBuilder calculation = new StringBuilder(number + "! = ");
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            calculation.append(i);
            if (i < number) {
                calculation.append(" * ");
            }
        }
        calculation.append(" = ").append(factorial);
        return calculation.toString();
    }
}
