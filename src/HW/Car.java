package HW;

public class Car{
    public void start() {
    System.out.println("Дры ня-ня-ня");
    }

    public void stop() {
        System.out.println("Ш-Ш-Ш-Ш-Ш");
    }
    public int drive(int howlonge) {
        int distance = howlonge * 60;
        System.out.println("Пройденный путь авто равен: " + distance);
        return distance;

    }
}
