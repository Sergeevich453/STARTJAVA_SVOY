package hw;
import java.util.Scanner;

public class Test_3_9 {
    public static void main(String[] agrs){
        // int num = 214421;
        // int rem = 0;
        // int sum = 0;
        // int count = 0;
        // int rem1 = 0;
        // int sum1 = 0;
        // int count1 = 0;
        /*while (count <= 5) {
            if (count <= 2) {
            rem = num % 10;
            sum += rem;
            num /= 10;
            } else {
                rem1 = num % 10;
                sum1 = sum1 + rem1;
                num /= 10;
            }
            if (count == 6) {
                break;
            }
            count++;
        }
        //while (count1 <= 2) {
            
            //count1++;
        //}



        num = 4664;
        copyNum = num;
        int digit = 0;
        int digitNum = 0;
        count = 0;
        while (copyNum != 0) {
            copyNum /= 10;
            count++;
        }
        for ( int i = 0; i < (count / 2) && num > 0; i++) {
            digit += num % 10;
            num /= 10;
            digitNum += num % 10;
            num /= 10;
        }
        if (digit == digitNum) {
            System.out.println("Сумма цифр digit = digitNum: " + digit + " = " + digitNum 
                    + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр digit != digitNum: " + digit + " = " + digitNum 
                    + "\nЧисло неявляется счастливым");
        }

        

        int num = 7575;
        int sum = 0;
        int sum1 = 0;
        int digit = num % 10;
        int count = 0;

        while(num!=0) {
        digit = num % 10;
        num/=10;
        ++count;
        }
        System.out.println("\ncount: " + count + " 1/1 " + (6/3));

        for (int i = 1; i <= count; i++) {
            if ((count/2) % i != 0) {
                sum += digit;
            } else if (count % i != 0) {
                sum1 += digit;
            }
            num /= 10;
            System.out.println("\nnum: " + num);
            //if (num == 0) {
              //  break;
            //}
        }
        if (sum == sum1) {
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1 + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1 + "\nЧисло неявляется счастливым");
        } 


    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a number: ");
    System.out.flush();
    int number = scanner.nextInt();

    int count = 0;
    int n = number;
    int sum = 0;
    while(n!=0) {
        int d = n % 10;
        n/=10;
        ++count;
            if (count % 3 == 0) {
            System.out.printf("sum = %d + %d^2 = %d\n", sum, d, sum + d * d);
            sum += d * d;
        }
    }

    if (sum%7==0) {
        System.out.printf("The number: %d is a Lucky number (%d = 7 * %d)", number, sum, sum / 7);
    }
    else {
        System.out.println("Oops! Not a Lucky number");
    }

    scanner.close();*/

    int num = 3545;
        int copyNum = num;
        int sumDigits = 0;
        int sumDigits1 = 0;
        int count = 0;
        while (copyNum != 0) {
            copyNum /= 10;
            count++;
        }
        for (int i = 1; i < (count + 1) ; i++) {
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

    }
}

