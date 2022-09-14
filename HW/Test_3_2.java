public class Test_3_2 {

    public static void main(String[] agrs) {
        /*System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num2 < num1 && num1 > num3) {
            max = num1;
        } else if (num3 < num2 && num2 > num1) {
            max = num2;
        } else {
            max = num3;
        }
        if (num2 > num1 && num1 < num3) {
            min = num1;
        } else if (num1 > num2 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        for (int i = max - 1; i >= min + 1; i--) {
            System.out.print(" " + i);
        }*/

        System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num2 < num1 && num1 > num3) {
            max = num1;
        } else if (num3 < num2 && num2 > num1) {
            max = num2;
        } else {
            max = num3;
        }
        if (num2 > num1 && num1 < num3) {
            min = num1;
        } else if (num1 > num2 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }
    }
}