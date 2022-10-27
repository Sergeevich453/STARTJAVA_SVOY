
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        
    
        int result = 1;
        Scanner s = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую цифру: ");
        int num1 = s.nextInt();
        System.out.println("Введите арифметический знак: ");
        char sign = scan.nextLine().charAt(0);
        System.out.println("Введите вторую цифру: ");
        int num2 = s.nextInt();

        public int vichisl(int num1, int num2) {
          //  this.sign = sign;
            switch(sign) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '^':
                    for(int i = 1; i <= num2; i++) {
                        result *= num1;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default: 
                    System.out.println("Вы ввели некорректное значение повторите попытку.");
                    break;
            }
            return result;
        }
    }
}

        //System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        //System.out.println(num1);

    
//}    
    // public static void main(String[] args) {
    //     int num1 = 10;
    //     int num2 = 5;
    //     int result = 1;
    //     char sign = '+';
    //     if (sign == '+') {
    //         result = num1 + num2;
    //     } else if (sign == '-') {
    //         result = num1 - num2;
    //     } else if (sign == '*') {
    //         result = num1 * num2;
    //     } else if (sign == '/') {
    //         result = num1 / num2;
    //     } else if (sign == '^') {
    //         for (int i = 1; i <= num2; i++) {
    //             result *= num1;
    //         }
    //     } else if (sign == '%') {
    //         result = num1 % num2;
    //     }
    //     System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    // }
