public class Test_3_2 {

    public static void main(String[] agrs) {
        System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMax = 0;
        int numMin = 0;
        if (num2 < num1 && num1 > num3) {
            numMax = num1;
        } else if (num3 < num2 && num2 > num1) {
            numMax = num2;
        } else {
            numMax = num3;
        }
        if (num2 > num1 && num1 < num3) {
            numMin = num1;
        } else if (num1 > num2 && num2 < num3) {
            numMin = num2;
        } else {
            numMin = num3;
        }
        for (int i = numMax; i >= numMin; i--) {
            System.out.println("i= " + i);
        }
    }
}