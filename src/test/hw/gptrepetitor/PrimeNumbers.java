package test.hw.gptrepetitor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PrimeNumbers {    
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВведите число f: ");
        int f = scanner.nextInt();
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= f; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
        System.out.println("Введите 5 значений массива: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int g = scanner.nextInt();
        int[] arrayNum = {a, b, c, d, g};
        System.out.println("Максимальное значение массива = " + findMax(arrayNum) +
                "\nМинимальное значение массива = " + findMin(arrayNum));
        reversArray(arrayNum);
        findDuplicates(arrayNum);
        String[] strings = {"apple", "banana", "cherry", "apple", "date", "banana", "apple"};
        findStringDuplicate(strings);
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL", "Oracle"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        findCommonElements(array1, array2);
    }
    
    public static boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }            
        }
        return max;
    }
    
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static void reversArray(int[] array) {
        System.out.println("Вывод неизмененного массива: ");
        for (int arrayUnmod : array) {
            System.out.print(arrayUnmod + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("\nМассив после изменения ");
        for (int arrayRevers : array) {
            System.out.print(arrayRevers + " ");
        }
    }
    
    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    System.out.println("\nЧисло дубликат в данном массиве: " + array[i]);
                }
            }
        }
    }
    
    public static void findStringDuplicate(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    System.out.println("\nДубликат в массиве: " + array[i]);
                }
            }
        }
    }
    
    public static void findCommonElements(String[] array1, String[] array2) {
        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]); 
                }
            }
        }
        System.out.println("Повторяющиеся элементы: " + (set));
    }
}
