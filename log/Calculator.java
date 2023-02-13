public class Calculator {
    
    public double calculator(char sign, double num1, double num2) {
        double result = 1;
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


