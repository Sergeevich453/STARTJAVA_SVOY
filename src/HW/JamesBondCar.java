public class JamesBondCar{
    public int drive(int howlonge) {
        int distance = howlonge * 180;
        System.out.println("Пройденный путь1 авто равен: " + distance);
        return distance;
    }
    public static void main(String[] args) {
        JamesBondCar JamesBond = new JamesBondCar();
        JamesBond.drive(2);
    }
}