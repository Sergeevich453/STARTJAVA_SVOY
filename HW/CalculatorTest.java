public class CalculatorTest {
    public static void main(String [] args){
        int num1 = 10;
        int num2 = 5;
        int result = 0;
        char sign = '+';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        }
        System.out.println("sign = " + sign);
        System.out.println("result = " + result);
    }
}