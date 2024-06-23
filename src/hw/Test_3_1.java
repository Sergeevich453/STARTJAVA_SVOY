package hw;
public class Test_3_1 {

    public static void main(String[] agrs) {
        System.out.println("\n\t" + "ЗАДАНИЕ 1 \nПодсчет суммы четных и нечетных чисел\n");
        int num1 = -10;
        int sum = 0;
        int sum1 = 0;
        do {
            if (num1 % 2 == 0) {
                sum = sum + num1;
            } else if ( num1 % 2 != 0) {
                sum1 = sum1 + num1;
            }
            num1++;
        } while (num1 <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sum
                + ", а сумма нечетных чисел = " + sum1);
    }
}