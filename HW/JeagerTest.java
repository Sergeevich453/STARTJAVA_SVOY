public class JeagerTest {

    public static void main(String [] args) {
        Jeager jeager1 = new Jeager(); // gipsyAvenger
        Jeager jeager2 = new Jeager("Gipsy Danger", "Mark - 3", "USA", 79.25, 1.980, 8, 6);
        jeager1.setModelName("Gipsy Avenger");
        System.out.println(jeager2.modelName);
        System.out.println(jeager1.getModelName());
        jeager1.move();
        System.out.println(jeager2.scanKaiju());
    }
}