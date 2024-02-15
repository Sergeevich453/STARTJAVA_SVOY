package package1.src.startjava.lesson_4.arrayTheme;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayTheme {
	
	private static void revers() {
		System.out.println("\n\t" + "ЗАДАНИЕ 1 \nРеверс значений массива\n");
		int a = 0;
		int [] num = {7, 1, 5, 3, 6, 4, 2};
		System.out.print("До реверса [");
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
			if (i < num.length - 1) {				
				System.out.print(",");
			} else {
				System.out.print(" ]");
			}
		}		
		a = num[0];
		num[0] = num[6];
		num[6] = a;
		a = num[1];
		num[1] = num[5];
		num[5] = a;
		a = num[2];
		num[2] = num[4];
		num[4] = a;

		System.out.print("\nПосле реверса [");
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
			if (i < num.length - 1) {				
				System.out.print(",");
			} else {
				System.out.print(" ]");
			}
		}		
		
	}
	
	private static void composition() {
		System.out.println("\n\t" + "ЗАДАНИЕ 2 \nПроизведение элементов "
				+ "массива\n");
		int sum = 0;
		int array = 0;
		String sign = " ";
		int [] num = new int[10];
		for (int i = 1; i < num.length; i++) {
			num[i] = i;
			sum = num[i] > 1 || num[i] > 8 ? sum + num[i - 1] : sum;
			sign = num[i] < 9 ? " * " : " = R ";
			array = num[i] > 1 || num[i] > 8 ? array = i ;
			System.out.print(num[i] + sign);
			
		}
		System.out.println("\nСумма = " + sum);
		
	}

	public static void main(String[] args) {
		ArrayTheme array = new ArrayTheme();		
		//array.revers();
		array.composition();
 	}

}
