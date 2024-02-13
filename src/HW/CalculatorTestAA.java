package HW;

public class CalculatorTestAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;
        while (true) {
            System.out.println("Введите первое число:");
            double a = sc.nextDouble();
            System.out.println("Введите знак математической операции:");
            String operation = sc.next();
            System.out.println("Введите второе число:");
            double b = sc.nextDouble();
            double result = calc.calculate(a, operation, b);
            System.out.println("Результат вычисления: " + result);
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = sc.next();
            if (answer.equals("no")) {
                break;
            }
        }
    }
}