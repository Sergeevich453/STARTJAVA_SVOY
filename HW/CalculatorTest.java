public class CalculatorTest {
    public static void main(String [] args){
        int num1 = 10;
        int num2 = 5;
        int result = 0;
        char sign = '%';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}