public class Test_3_9 {
    public static void main(String[] agrs){
        // int num = 214421;
        // int rem = 0;
        // int sum = 0;
        // int count = 0;
        // int rem1 = 0;
        // int sum1 = 0;
        // int count1 = 0;
/*        while (count <= 5) {
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
        int num = 65;
        int sum = 0;
        int sum1 = 0;
        int digit = num % 10;
        for (int i = 0; i <= 5; i++) {
            if (i <= 2) {
                sum += digit;
            } else {
                sum1 += digit;
            }
            num /= 10;
            System.out.println("\nnum: " + num);
            if (num == 0) {
                break;
            }
        }
        if (sum == sum1) {
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1 + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1 + "\nЧисло неявляется счастливым");
        }*/

        int num = 5665;
        int num1 = num;
        int sum = 0;
        int sum1 = 0;
        int digit = num % 10;
        int count = 0;
        while (num1 != 0) {
            num1 /= 10;
            count++;            
        }
        for ( int i = 0; i < (count / 2) && num > 0 ; i++) {
            sum += num % 10;
            num /= 10;
        }
        for ( int i = 0; i < (count / 2) && num > 0 ; i++) {
            sum1 += num % 10;
            num /= 10;
        }
        if (sum == sum1) {
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1 
                    + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1 
                    + "\nЧисло неявляется счастливым");
        }
    }
}