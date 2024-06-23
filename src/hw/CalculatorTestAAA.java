package hw;

public class CalculatorTestAAA {
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
            } else if (answer.equals("yes")) {
                continue;
            } else {
                System.out.println("Пожалуйста, введите yes или no.");
            }
        }
    }
}

class CalculatorAAA {
    double calculate(double a, String operation, double b) {
        double result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
        }
        return result;
    }
}