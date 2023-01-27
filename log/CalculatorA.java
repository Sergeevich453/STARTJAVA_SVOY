public class CalculatorA {
    public double calculator(double num1, char sign, double num2) {
        double result = 1;
        switch(sign) {
            case('+'):
                result = num1 + num2;
                break;
            case('-'):
                result = num1 - num2;
                break;
            case('/'):
                result = num1 / num2;
                break;
            case('*'):
                result = num1 + num2;
                break;
            case('^'):
                for(int i = 1; i <= num2; i++){
                    result = num1 * num1;
                }
                break;
            case('%'):
                result = num1 % num2;
                break;
        }
        return result;
    }
}

//Scanner input = new Scanner(System.in);