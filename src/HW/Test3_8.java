public class Test3_8 {
    public static void main(String [] args){
        int num = 1234321;
        int rev = 0;
        int rem = 0;
        int checkNum = num;
        while(num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            System.out.println("rev " + rev);
            num = num / 10;
        }
        if( checkNum == rev){
            System.out.println("Число является палиндромом " + "\nЗаданное число: " + checkNum + "\nРеверс числа: " + rev);
        } else {
            System.out.println("Число неявляется палиндромом " + "\nЗаданное число: " + checkNum + "\nРеверс числа: " + rev);
        }
        
    }
}