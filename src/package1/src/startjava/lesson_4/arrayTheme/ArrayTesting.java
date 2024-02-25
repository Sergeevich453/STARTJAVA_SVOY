package package1.src.startjava.lesson_4.arrayTheme;

import java.util.Arrays;
import java.util.Random;

public class ArrayTesting {

	public static void main(String[] args) {
		 System.out.print("\n5. Заполнение массива уникальными числами");
	        int[] uniqueNums = new int[30];
	        int len = uniqueNums.length;
	        Random random = new Random();

	        uniqueNums[0] = random.nextInt(100) + 60;
	        for (int i = 1; i < len; i++) {
	            int randomNum = random.nextInt(100) + 60;
	            for (int j = 0; j < i; j++) {
	                if (randomNum == uniqueNums[j]) {
	                    randomNum = -1;
	                    i--;
	                    break;
	                }
	            }
	            if (randomNum != -1) {
	                uniqueNums[i] = randomNum;
	            }
	        }
	        Arrays.sort(uniqueNums);
	        print(uniqueNums);
	    }

	    private static void print(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(i % 10 == 0 ? "\n" : array[i] + " ");
	        }
	    }
	}
 


