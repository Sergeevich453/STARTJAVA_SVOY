import java.util.Scanner;


public class TestTest1 {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner sign = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String N = "N";
        String Y = "Y";         
        Calculator b = new Calculator();
        boolean otv = true;
        while (otv) {
            System.out.println("Введите первую цифру: ");
            int num1 = num.nextInt();
            System.out.println("Введите арифметический знак: ");
            char sign1 = sign.nextLine().charAt(0);
            System.out.println("Введите вторую цифру: ");
            int num2 = num.nextInt();
            System.out.println("Ответ: " + b.calculator(sign1, num1, num2));
            System.out.println("\nЖелаете продолжить? Да - нажмите Y" + "\n Нет - нажмите N");
            String answer = str.nextLine();
            System.out.println("answer: " + answer);
            if (answer.equals(N)) {
                otv = false;
                System.out.println("Программа завершена!");
            } else if (answer.equals(Y)) {
                otv = true;
            } else {
                System.out.println("Вы ввели некорректный ответ");
                otv = true;
            }
        }
    }
}   