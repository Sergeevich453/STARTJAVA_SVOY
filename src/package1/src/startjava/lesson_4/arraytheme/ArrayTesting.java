package package1.src.startjava.lesson_4.arraytheme;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;

public class ArrayTesting {
	
	public static void main(String[] args) {
		sortArr();
		sumArr();
		tableOutput();
		calculateAverage();
		checkingContent();
		findIndexMain();
		removeElement();
		copyArr();
		insertElement();
		maxMinArray();
		}
	
	public static void initializingArr (int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = i * i;
		}
	}
	
	public static void fillingArr(int[] arr) {
		arr[0] = (int) (Math.random()*(99 - 60)) + 60;
		for (int i = 0; i <  arr.length; i++) {
			int randomNum = (int) (Math.random()*(99 - 60)) + 60;
			for ( int j = 0; j <= i; j++) {
				if (randomNum == arr[j]) {
					i--;
					randomNum = -1;
					break;
				}
			}	
			if (randomNum != -1) {
				arr[i] = randomNum;
			}
		}
		Arrays.sort(arr);
		System.out.println("Массив: " + Arrays.toString(arr));
	}
	
	public static void mathInitializingArr (int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) { 
			arr[i] = (int) (Math.random()*(99 - 60)) + 60;;
		}
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
		fillingArr(numInt);
		System.out.print(" содержит заданное число? " + num + " - " + contans(numInt, num));
	}
	
	private static boolean contans(int[] arr, int item) {
		for (int a: arr) {
			if (a == item) {
				return true;
			}
		}
		return false;
	}
	
	private static OptionalInt findIndex(int[] arr, int t) {
		if (arr == null) {
			return OptionalInt.empty();
		}
		int len = arr.length;
		int i = 0;
		while (i < len) {
			if (arr[i] == t) {
				return OptionalInt.of(i);
			} else {
				i = 1 + i;
			}			
		}
		return OptionalInt.empty();		
	}
	
	private static void findIndexMain() {
		System.out.println("\n\n\tМассивы Задача №6");
		int[] nums = new int[30];
		fillingArr(nums);		
		findIndex(nums, 68).ifPresent(index -> System.out.println("Значения 68 в индексе " + index));
		findIndex(nums, 97).ifPresent(index -> System.out.println("Значения 97 в индексе " + index));
		findIndex(nums, 76).ifPresent(index -> System.out.println("Значения 76 в индексе " + index));
	}
	
	private static void removeElement() {
		System.out.println("\n\n\tМассивы Задача №7");
		int[] nums = new int[10];
		System.out.println("Массив до удаления заданного индекса ");
		fillingArr(nums);		
		int removeIndex = 6;
		for (int i = removeIndex; i < nums.length -1; i++) {
			nums[i] = nums[i + 1];
		}
		System.out.println("Массив после удаления заданного индекса " + Arrays.toString(nums));
	}	
	
	private static void copyArr() {
		System.out.println("\n\n\tМассивы Задача №8");
		int[] nums = new int[15];
		int[] nums1 = new int[15];
		fillingArr(nums);		
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
		}
		System.out.println("Массив после копирования " + Arrays.toString(nums1)); 
	}	
	
	private static void insertElement() {
		System.out.println("\n\n\tМассивы Задача №9");
		int[] nums = new int[15];
		int newIndex = 2;
		int newValue = 5;
		fillingArr(nums);
		for (int i = nums.length - 1; i > newIndex; i--) {
			nums[i] = nums[i - 1];
		}
		nums[newIndex] = newValue;
		System.out.println("Массив после изменения " + Arrays.toString(nums));
	}
	
	
	
	private static void maxMinArray() {
		System.out.println("\n\n\tМассивы Задача №10");
		int max = 0;
		int min = 0;
		int[] arr = new int[3];
		max = arr[0];
		min = arr[0];
		int len = arr.length;
		mathInitializingArr(arr);
		
		for (int i = 0; i < len - 1; i++) {
//			if (i + 1 > len) {
//				if (arr[i] > max) {
//					max = arr[i];
//				}
//				if (arr[i] < min) {
//					min = arr[i];
//				}
//			}
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > max) {
					max = arr[i];
				}
				if (arr[i + 1] < min) {
					min = arr[i + 1];
				}
			}
			if (arr[i] < arr[i + 1]) {
				if (arr[i] < min) {
					min = arr[i];
				}
				if (arr[i + 1] > max) {
					max = arr[i + 1];
				}
			}
		}
		System.out.println("Значение массива: " + Arrays.toString(arr));
		System.out.println("Максимальное значение массива = " + max);
		System.out.println("Минимальное значение массива = " + min);
	}
	
}
 


