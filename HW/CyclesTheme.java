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
        for(int i = 0; i <= 3 ; i++){
            if(num1 > num2 & num1 > num3){
                numMax = num1;
            }
            if(num1 < num2 & num1 > num3 || num1 > num2 & num1 < num3 ){
                numMid = num1;
            }
            if(num1 < num2 & num1 < num3){
                numMin = num1;
            }
            if(num2 > num1 & num2 > num1){
                numMax = num2;
            }
            if(num2 < num1 & num2 > num1 || num2 > num1 & num2 < num1 ){
                numMid = num2;
            }
            if(num2 < num1 & num2 < num1){
                numMin = num2;
            }
            if(num3 > num2 & num3 > num1){
                numMax = num3;
            }
            if(num3 < num2 & num3 > num1 || num3 > num2 & num3 < num1 ){
                numMid = num3;
            }
            if(num3 < num2 & num3 < num1){
                numMin = num3;
            }
        }
        System.out.println(numMin + " min " + numMid + " mid " + numMax + " max ");

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 3 \nВывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int rem = 0;
        int rev = 0;
        int sum = 0;
        while(num>0){
        rem = num % 10;
        rev = rev * 10 + rem;
        sum = sum + rem;
        num = num / 10;
        }
        System.out.println("revers " + rev + "\nsum" + sum);

        /*System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 4 \nВывод чисел на консоль в несколько строк\n");
        int count = 0;
        for(int i = 1; i <= 24; i += 2){
            System.out.printf("%3d", i);
            count++;
            if(count % 5 == 0){
                while(count % 5 != 0){
                    System.out.println("0");
                }
                System.out.println();
            }
            }*/
    }
}