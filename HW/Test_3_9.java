public class Test_3_9 {
    public static void main(String[] agrs){
        int num = 214421;
        int rem = 0;
        int sum = 0;
        int count = 0;
        int rem1 = 0;
        int sum1 = 0;
        int count1 = 0;
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
        //}*/

        for ( int i = 0; i <= 5; i++) {
            if (i <= 2) {
                rem = num % 10;
                sum += rem;
            } else {
                rem = num % 10;
                sum1 += rem;
            }
            num /= 10;
        }

        if (sum == sum1) {
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1 + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1 + "\nЧисло неявляется счастливым");
        }
        
    }
}