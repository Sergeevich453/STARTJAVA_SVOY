package package1.src.startjava.lesson_4.arrayTheme;

import java.util.Arrays;
import java.util.Random;

public class ArrayTesting {
	
	public static void main(String[] args) {
		sortArr();
		sumArr();
		tableOutput();
		calculateAverage();
		checkingContent();
		}
	
	private static void sortArr() {
		System.out.println("\n\tМассивы Задача №1");
		int[] myInt = {4, -5, 9, 76, 0};
		String[] myString = {"Java", "C", "C++", "Pyton", "#"}; 
		System.out.println("До сортировки: " + Arrays.toString(myInt));
		System.out.println("До сортировки: " + Arrays.toString(myString));
		Arrays.sort(myInt);
		Arrays.sort(myString);
		System.out.println("После сортировки: " + Arrays.toString(myInt));
		System.out.println("После сортировки: " + Arrays.toString(myString));
	}
	
	private static void initializingArr (int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = i * i;
		}
	}
	
	private static void sumArr() {
		System.out.println("\n\tМассивы Задача №2");
		int[] numInt = new int[10];
		initializingArr(numInt);
		System.out.println("Массив: " + Arrays.toString(numInt));
		
		int sum = 0;
		for (int arr : numInt) {
			sum +=arr;
		}
		System.out.println("Сумма чисел массива = " + sum);
				
	}
	
	private static void tableOutput() {
		System.out.println("\n\tМассивы Задача №3");
		int[][] numInt = new int[10][10];
		for (int i = 0; i <= numInt.length - 1; i++) {
			for (int j = 0; j <= numInt.length - 1; j++) {
				System.out.printf("%2d ", + numInt[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void mathInitializingArr (int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) { 
			arr[i] = (int) (Math.random()*(99 - 60)) + 60;;
		}
	}
	
	private static void calculateAverage() {
		System.out.println("\n\tМассивы Задача №4");
		int[] numInt = new int[10];
		mathInitializingArr(numInt);
		System.out.println("Массив: " + Arrays.toString(numInt));
		
		int sum = 0;
		int average = 0;
		for (int arr : numInt) {
			sum +=arr;
		}
		average = sum/numInt.length;
		System.out.println("Среднее значение массива = " + average);
	}
	
	private static void checkingContent() {
		System.out.println("\n\tМассивы Задача №5");
		int[] numInt = new int[15];
		int num = 75;
		mathInitializingArr(numInt);
		Arrays.sort(numInt);
		System.out.println("Массив: " + Arrays.toString(numInt)  + " содержит заданное число? " 
					+ num + " - " + contans(numInt, num));
	}
	
	private static boolean contans(int[] arr, int item) {
		for (int a: arr) {
			if (a == item) {
				return true;
			}
		}
		return false;
	}

		// добавить в метод checkingC -- метод из класса ArraTheme 5 задачи 

	
}
 


