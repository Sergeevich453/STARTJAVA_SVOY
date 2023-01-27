import java.util.Scanner;

public class CalculatorATest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        CalculatorA calculator = new CalculatorA();
        //String answer = "";
        while(true) {
            System.out.println("Введите первое число: ");
            double num1 = input.nextDouble();
            System.out.println("Введите арифметический знак: ");
            char sign = input.next().charAt(0);
            System.out.println("Введите первое число: ");
            double num2 = input.nextDouble();
            System.out.println("Результат: " + calculator.calculator(num1, sign, num2));
            System.out.println("Ответьте yes если желаете продолжить или no");
            String answer = input1.nextLine();
            if(answer.equals("yes")) {
                continue;
            }
            else if(answer.equals("no")) {
                break;
            }
            else {
                System.out.println("Ответьте yes если желаете продолжить или no");
            }
        }
    }
}