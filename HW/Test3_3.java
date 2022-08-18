public class Test3_3 {
    public static void main(String[] args) {
        
        System.out.println("\n\t" + "ЗАДАНИЕ 3 \nВывод реверсивного числа и суммы его цифр\n");
        int num = 6985;
        int numRem = 0;
        int numRev = 0;
        int numSum = 0;
        while (num > 0){
        numRem = num % 10;
        numRev = numRev * 10 + numRem;
        numSum = numSum + numRem;
        num = num / 10;
        }
        System.out.println("Исходное число в обратном порядке: " + numRev + "\nСумма его цифр: " + numSum);
    }
}