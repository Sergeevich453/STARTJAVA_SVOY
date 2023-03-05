import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;
        do {
            System.out.println("Введите первую цифру: ");
            int num1 = scan.nextInt();
            System.out.println("Введите арифметический знак: ");
            char sign = scan.next().charAt(0);
            System.out.println("Введите вторую цифру: ");
            int num2 = scan.nextInt();
            System.out.println("Ответ: " + calculator.calculate(num1, sign, num2));
            do {
                System.out.println("\nЖелаете продолжить: [yes / no]");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
