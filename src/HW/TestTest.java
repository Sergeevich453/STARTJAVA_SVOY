import java.util.Scanner;

public class TestTest {
    
    public int calculator(char sign, int num1, int num2) {
        int result = 1;
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