public class CyclesTheme{
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 1 \nПодсчет суммы четных и нечетных чисел\n");
        int i = 0;
        int b = -10;
        do{
            b = b + i;
            if(b % 2 == 0){
                System.out.println("Число: " + b + " четное");
            }else( b % 2 != 0){
                System.out.println("Число: " + b + " нечетное");
            }
            
            i++;
        }while(b < 20);

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = 0;
        int sred = 0;
        int min = 0;
        for(int i = 0; i <= 3 ; i++){
            if(a > b & a > c){
                max = a;
            }
            if(a < b & a > c || a > b & a < c ){
                sred = a;
            }
            if(a < b & a < c){
                min = a;
            }
            if(b > a & b > a){
                max = b;
            }
            if(b < a & b > a || b > a & b < a ){
                sred = b;
            }
            if(b < a & b < a){
                min = b;
            }
            if(c > b & c > a){
                max = c;
            }
            if(c < b & c > a || c > b & c < a ){
                sred = c;
            }
            if(c < b & c < a){
                min = c;
            }
        }
        System.out.println(min + " min " + sred + " sred " + max + " max ");

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 3 \nВывод реверсивного числа и суммы его цифр\n");
        int rem = 0;
        int num = 1234;
        int rev = 0;
        int sum = 0;
        while(num>0){
        rem = num % 10;
        rev = rev * 10 + rem;
        sum = sum + rem;
        num = num / 10;
        }
        System.out.println("revers " + rev + "\nsum" + sum); 
    }
}