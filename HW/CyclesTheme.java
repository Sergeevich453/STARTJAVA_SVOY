public class CyclesTheme{
    public static void main(String[] args) {

        System.out.println("\n\t" + "ЗАДАНИЕ 1 \nПодсчет суммы четных и нечетных чисел\n");
        int num1 = 0;
        int num2 = -10;
        do {
            num2 = num2 + num1;
            if (num2 % 2 == 0) {
                System.out.println("Число: " + num2 + " четное");
            } else if ( num2 % 2 != 0) {
                System.out.println("Число: " + num2 + " нечетное");
            }
            num1++;
        } while (num2 < 20);

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        num1 = -10;
        num2 = 5;
        int num3 = -1;
        int numMax = 0;
        int numMid = 0;
        int numMin = 0;
        for (int i = 0; i <= 3 ; i++) {
            if (num1 > num2 & num1 > num3) {
                numMax = num1;
            }
            if (num1 < num2 & num1 > num3 || num1 > num2 & num1 < num3 ) {
                numMid = num1;
            }
            if (num1 < num2 & num1 < num3) {
                numMin = num1;
            }
            if (num2 > num1 & num2 > num1) {
                numMax = num2;
            }
            if (num2 < num1 & num2 > num1 || num2 > num1 & num2 < num1 ) {
                numMid = num2;
            }
            if (num2 < num1 & num2 < num1) {
                numMin = num2;
            }
            if (num3 > num2 & num3 > num1) {
                numMax = num3;
            }
            if (num3 < num2 & num3 > num1 || num3 > num2 & num3 < num1 ) {
                numMid = num3;
            }
            if (num3 < num2 & num3 < num1) {
                numMin = num3;
            }
        }
        System.out.println(numMin + " min " + numMid + " mid " + numMax + " max ");

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 3 \nВывод реверсивного числа и суммы его цифр\n");
        int num = 1231;
        int rem = 0;
        int rev = 0;
        int sum = 0;
        while (num > 0) {
        rem = num % 10;
        rev = rev * 10 + rem;
        sum = sum + rem;
        num = num / 10;
        }
        System.out.println("revers " + rev + "\nsum" + sum);

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 4 \nВывод чисел на консоль в несколько строк\n");
        int count = 0;
        for(int i = 1; i <= 24; i += 2){
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 5 \nПроверка количества единиц на четность\n");
        num = 3141591;
        num1 = num;
        int checkNum = 0;
        int one = 0;
        while (num > 0) {
            checkNum = num % 10;
            if (checkNum == 1) {
                one++;
            }
            num = num / 10;
        }
        if (one % 2 == 0) {
            System.out.println("число " + num1 + " содержит " + one + " четное количество единиц");
        } else {
            System.out.println("число " + num1 + " содержит " + one + " нечетное количество единиц");
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 6 \nОтображение фигур в консоли\n");
        count = 0;
        for (int i = 0; i <= 49; i++) {
            System.out.print("*");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        int i = 10;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            i--;
        }
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 2);
        i = 2;
        do {
            int j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            i--;
        } while (i >= 1 );

        System.out.println("\n\t" + "ЗАДАНИЕ 7 \nОтображение ASCII-символов\n");
        for (i = 0; i <= 47; i++) {
            if (((int) i) % 2 != 0) {
                System.out.printf("%6s%6s", i, ((char) i));
                System.out.println();
            }
        }
        System.out.println();
        for (i = 97; i <= 122; i++) {
            if (((int) i) % 2 == 0) {
                System.out.printf("%6s%6s",  i, ((char) i));
                System.out.println();
            }
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 8 \nПроверка, является ли число палиндромом\n");
        num = 1234321;
        rev = 0;
        rem = 0;
        checkNum = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (checkNum == rev) {
            System.out.println("Число является палиндромом " + "\nЗаданное число: " + checkNum
                    + "\nРеверс числа: " + rev);
        } else {
            System.out.println("Число неявляется палиндромом " + "\nЗаданное число: " + checkNum
                + "\nРеверс числа: " + rev);
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 9 \nОпределение, является ли число счастливым\n");
        num = 657576;
        rem = 0;
        rev = 0;
        sum = 0;
        count = 0;
        int rev1 = 0;
        int rem1 = 0;
        int sum1 = 0;
        int count1 = 0;
        while (count <= 2) {
            rem = num % 10;
            rev = rev * 10 + rem;
            sum = sum + rem;
            num = num / 10;
            count++;
        }
        while (count1 <= 2) {
            rem1 = num % 10;
            rev1 = rev1 * 10 + rem1;
            sum1 = sum1 + rem1;
            num = num / 10;
            count1++;
        }
        if (sum == sum1) {
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1
                    + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1
                    + "\nЧисло неявляется счастливым");
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 10 \nВывод таблицы умножения Пифагора\n");
        System.out.print("\tТАБЛИЦА ПИФАГОРА " + "\n   ");
        for(i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for(i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}