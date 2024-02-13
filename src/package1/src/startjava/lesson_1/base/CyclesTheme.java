package package1.src.startjava.lesson_1.base;

public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n\t" + "ЗАДАНИЕ 1 \nПодсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven
                + ", а сумма нечетных чисел = " + sumOdd);

        System.out.println("\n\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
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
        for (int i = --max; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n" + "\n\t" + "ЗАДАНИЕ 3 \nВывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sumDigits = 0;
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sumDigits += digit;
            num /= 10;
        }
        System.out.println("\nСумма чисел = " + sumDigits);

        System.out.println("\n\t" + "ЗАДАНИЕ 4 \nВывод чисел на консоль в несколько строк\n");
        int count = 0;
        for (int i = 1; i <= 24; i += 2) {
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

        System.out.println("\n" + "\n\t" + "ЗАДАНИЕ 5 \nПроверка количества единиц на четность\n");
        num = 3141591;
        int copyNum = num;
        int countOnes = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 1) {
                countOnes++;
            }
            num /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("число " + copyNum + " содержит " + countOnes + " четное количество единиц");
        } else {
            System.out.println("число " + copyNum + " содержит " + countOnes + " нечетное количество единиц");
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

        System.out.println();
        int countSymbols = 10;
        while (countSymbols >= 1) {
            int countLines = 1;
            while (countLines <= countSymbols) {
                System.out.print("#");
                countLines++;
            }
            System.out.println();
            countSymbols--; 
        }

        System.out.println();
        countSymbols = 5;
        int countLines = 0;
        do {
            if (countSymbols < 3) {
                countLines = countSymbols;
            } else {
                countLines = 6 - countSymbols;
            }
            do {
                System.out.print("*");
                countLines--;
            } while (countLines > 0);
            System.out.println();
            countSymbols--; 
        } while (countSymbols > 0);

        System.out.println("\n\t" + "ЗАДАНИЕ 7 \nОтображение ASCII-символов\n");
        System.out.printf("%7s%7s%n%n", "Dec", "Char");
        for (char i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%6d%6c%n", (int) i, i);
            }
        }
        for (char i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%6d%6c%n", ((int) i), i);
            }
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 8 \nПроверка, является ли число палиндромом\n");
        num = 1234321;
        int reverseNum = 0;
        copyNum = num;
        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        if (copyNum == reverseNum) {
            System.out.println("Число является палиндромом " + "\nЗаданное число: " + copyNum
                    + "\nРеверс числа: " + reverseNum);
        } else {
            System.out.println("Число неявляется палиндромом " + "\nЗаданное число: " + copyNum
                + "\nРеверс числа: " + reverseNum);
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 9 \nОпределение, является ли число счастливым\n");
        num = 4664;
        copyNum = num;
        sumDigits = 0;
        int sumDigits1 = 0;
        count = 0;
        while (copyNum != 0) {
            copyNum /= 10;
            count++;
        }
        for (int i = 1; i < (count + 1); i++) {
            if (i <= (count / 2)) { 
                sumDigits += num % 10;
            } else {
                sumDigits1 += num % 10;
                }
            num /= 10;
        }
        if (sumDigits == sumDigits1) {
            System.out.println("Сумма цифр sumDigits = sumDigits1: " + sumDigits + " = " + sumDigits1 
                    + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sumDigits != sumDigits1: " + sumDigits + " = " + sumDigits1 
                    + "\nЧисло не является счастливым");
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 10 \nВывод таблицы умножения Пифагора\n");
        System.out.print("\tТАБЛИЦА ПИФАГОРА " + "\n   ");
        for (int i = 2; i <= 9; i++) {
            if (i == 2) {
                System.out.printf("%3s%3d", (char) 124, i);
            } else {
                System.out.printf("%3d", i);
            }
        }
        for (int i = 2; i < 10; i++) {
            if (i == 2) {
                System.out.println("\n  ----------------------------");
            }
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf("%3d%3s", i * j, (char) 124);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}
