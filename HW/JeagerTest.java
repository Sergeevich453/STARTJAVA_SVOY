public class JeagerTest {

    public static void main(String [] args) {
        Jeager Jeager1 = new Jeager("Gipsy Danger", "Mark - 3", "USA", 79.25, 1.980, 7, 8, 6);
        Jeager Jeager2 = new Jeager();
        Jeager2.setModelName("Striker Eureka");
        Jeager2.setMark("Mark - 5");
        Jeager2.setOrigin("Australia");
        Jeager2.setHeight(250);
        Jeager2.setWeight(1.85);
        Jeager2.setSpeed(10);
        Jeager2.setStrengt(10);
        Jeager2.setArmor(9);

    }
}


/*
Jeager jeager1 = new Jeager(); // gipsyAvenger
        Jeager jeager2 = new Jeager("Gipsy Danger", "Mark - 3", "USA", 79.25, 1.980, 8, 6);
        jeager1.setModelName("Gipsy Avenger");
        System.out.println(jeager2.modelName);
        System.out.println(jeager1.getModelName());
        jeager1.move();
        System.out.println(jeager2.scanKaiju());

*/