public class Test3_9 {
    public static void main(String [] args){
        int num = 123321;
        int rem = 0;
        int rem1 = 0;
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        int count1 = 0;
        while (count <= 2) {
            rem = num % 10;
            sum = rem + sum;
            num = num / 10;
            count++;
        }
        while (count1 <= 2) {
                rem1 = num % 10;
                sum1 = rem + sum;
                num = num / 10;
                count1++;
            }

        System.out.print(" sum: " + sum + " sum1: " + sum1);

















        /*for (int i = 0; i <= 4; i++) {
            rem = num % 10;
            System.out.println("rem: " + rem);
            sum = sum + rem;
        }
        System.out.println("num: " + num);
        int rem1 = 0;
        for (int i = 0; i <= 4; i++) {
            
            rem1 = num % 10;
            System.out.println("rem1: " + rem1);

            sum1 = sum1 + rem1;
        }
        System.out.println("\nnum1: " + num);
        System.out.println("sum:" + sum + "\nsum1: " + sum1);*/
    }
}