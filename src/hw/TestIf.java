package hw;
import java.util.Scanner;

public class TestIf {

    public static void main(String[] agrs){
        Scanner str = new Scanner(System.in);
        String N = "N";
        String Y = "Y";
        System.out.println("Желаете продолжить? Да - нажмите Y" + "\n Нет - нажмите N");
        String otvet = str.nextLine();
        String otvet1 = "N";
        boolean otv;
        if (otvet.equals(N)) {
                otv = true;
            } else if (otvet.equals(Y)) {
                otv = false;
            } else {
                System.out.println("Вы ввели некорректный ответ");
                otv = true;
            }
        System.out.println("otvet: " + otvet + otvet1 + " otv: " + otv);
    }
}