public class Test_3_2 {

    public static void main(String[] agrs) {
<<<<<<< HEAD
        System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        /*int num1 = 10;
=======
        /*System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
>>>>>>> fae3d2a592707cf991d19f872980a652a2a0184d
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
        }

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

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2) {
            max = --num1;
        } else {
            max = --num2;
        }
        if (max < num3) {
            max = --num3;
        }
        if (num1 < num2) {
            min = ++num1;
        } else {
            min = ++num2;
        }
        if (min > num3) {
            min = ++num3;
        }
        for (int i = max; i >= min; i--) {
            System.out.print(" " + i);
        }*/

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num2;
        int min = num1;
        if (num1 > max) {
            max = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        for (int i = (max - 1); i >= (min + 1); i--) {
            System.out.print(" " + i);
        }

    }
}