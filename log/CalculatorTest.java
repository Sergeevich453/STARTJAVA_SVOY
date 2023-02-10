import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner sign = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Calculator calculation = new Calculator();
        String answer;
        do {
            System.out.println("Введите первую цифру: ");
            int num1 = num.nextInt();
            System.out.println("Введите арифметический знак: ");
            char sign1 = sign.nextLine().charAt(0);
            System.out.println("Введите вторую цифру: ");
            int num2 = num.nextInt();
            System.out.println("Ответ: " + calculation.calculator(sign1, num1, num2));
            do {
                System.out.println("\nЖелаете продолжить: [yes / no]");
                answer = str.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }while (answer.equals("yes"));
    }
}


// if (answer.equals("no")) {
//                 break;
//                 System.out.println("Программа завершена!");
//             } else if (answer.equals("yes")) {
//                 continue;
//             } else {
//                 System.out.println("Вы ввели некорректный ответ");
//                 otv = true;
//             }