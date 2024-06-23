package hw;
public class Test3_5{
    public static void main(String [] args){
        
        System.out.println("\n\t" + "ЗАДАНИЕ 5 \nПроверка количества единиц на четность\n");
        int num = 3141591;
        int checkNum = 0;
        int one = 0;
        int num1 = num;
        while (num > 0){
            checkNum = num % 10;
            if(checkNum == 1){
                one++;
            }
            num = num / 10;
        }
        if (one % 2 == 0) {
            System.out.println("число " + num1 + " содержит " + one + " четное количество единиц");
        } else {
            System.out.println("число " + num1 + " содержит " + one + " нечетное количество единиц");
        }
    }
}