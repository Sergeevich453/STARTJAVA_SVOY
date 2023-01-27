import java.util.*;
import java.util.Scanner;

public class CalculatorATest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); 
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        CalculatorA calculator = new CalculatorA();
        double num1 = 0;
        double num2 = 0;
        while(true) {
            int count = 0;
            System.out.println("Введите первое число: ");
            if(input.hasNextDouble()) {
                num1 = input.nextInt();
                System.out.println("корректно1");
                //break;
            } else {
                System.out.println("Знак введен некорректно!");
                break;
            }

            System.out.println("Введите арифметический знак: ");
            String sign = input1.nextLine();
            if(sign.equals("+") | sign.equals("-") | sign.equals("/") | sign.equals("*") | sign.equals("%") 
                    | sign.equals("^")) {
            } else {
                System.out.println("Знак введен некорректно!");
                continue;
            }
            System.out.println("Введите второе число: ");
            if(input.hasNextDouble()) {
                num2 = input.nextInt();
                System.out.println("корректно1");
                //break;
            } else {
                System.out.println("Знак введен некорректно!");
                break;
            }
            System.out.println("Результат: " + calculator.calculator(num1, sign, num2));
            System.out.println("Ответьте yes если желаете продолжить или no");
            
                while(count == 0) {
                    String answer = input2.nextLine();
                    if(answer.equals("yes")) {
                        count = 1;
                    }
                    else if(answer.equals("no")) {
                        break;
                    }
                    else {
                        System.out.println("Ответьте yes если желаете продолжить или no");
                        continue;
                    }
                }
        }
    }
}

/* char sign = input.next().charAt(0);
if(sign != '+' || sign != '-' || sign != '/' || sign != '*' || sign != '%' || sign != '+' 
                    || sign != '^' || sign != '%') 



if(sign.equals('+') | sign.equals('-') | sign.equals('/') | sign.equals('*') | sign.equals('%') 
                    | sign.equals('+')) {
                System.out.println("Знак введен некорректно!");
                continue;
            } else {
            }


if(sign != '+' | sign != '-' | sign != '/' | sign != '*' | sign != '%' | sign != '+') {
            return
            System.out.println("Знак введен некорректно!");
        } else {
        }
        .

        if(input.hasNext().charAt(0)) {
            }
            else {
                System.out.println("Знак введен некорректно!");
                continue;
            }*/