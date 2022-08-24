public class Test_3_9 {
    public static void main(String[] agrs){
        int num = 657576;
        int rem = 0;
        int rev = 0;
        int sum = 0;
        int count = 0;
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
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1 + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1 + "\nЧисло неявляется счастливым");
        }
        
    }
}