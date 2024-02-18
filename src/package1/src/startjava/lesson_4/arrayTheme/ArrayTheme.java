package package1.src.startjava.lesson_4.arrayTheme;

import java.util.Arrays;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayTheme {
	
	private static void revers() {
		System.out.println("\n\t" + "ЗАДАНИЕ 1 \nРеверс значений массива\n");
		int[] nums = {7, 6, 2, 3, 5, 4, 1};
		int len = nums.length - 1;
		System.out.println("До реверса: " + Arrays.toString(nums));
		
		for (int i = 0; i <= len / 2; i++, len--) {
			int temp = nums[i];
			nums[i] = nums[len];
			nums[len] = temp;
		}
		System.out.println("После реверса " + Arrays.toString(nums));
	}
	
	private static void composition() {
		System.out.println("\n\n\t" + "ЗАДАНИЕ 2 \nПроизведение элементов массива\n");		
		String sign = " ";
		int sum = 0;
		int [] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}	
		
		for (int i = 1; i < nums.length - 1; i++) {
			sum *= nums[i];
			sign = nums[i] == nums.length - 2 ? " = R" : " * ";
			System.out.print(nums[i] + sign);			
		}		
	}
	
	private static void deleting() {
		System.out.println("\n\n\t" + "ЗАДАНИЕ 3 \nУдаление элементов массива\n");
		double [] array = new double[15];
		for (double i = 0.0; i < array.length - 1; i++) {
			
		}
		
		
	}

	public static void main(String[] args) {
		ArrayTheme array = new ArrayTheme();		
		revers();
//		array.composition();
 	}

}
