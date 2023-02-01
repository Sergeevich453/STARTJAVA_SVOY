public class JeagerTest {

    public static void main(String [] args) {
        Jeager Jeager1 = new Jeager("Gipsy Danger", "Mark - 3", "USA", 79.25, 1.980, 7, 8, 6, "Sting-Blades", 
                "Chest launcher");
        Jeager Jeager2 = new Jeager();
        Jeager2.setModelName("Striker Eureka");
        Jeager2.setMark("Mark - 5");
        Jeager2.setOrigin("Australia");
        Jeager2.setHeight(250);
        Jeager2.setWeight(1.85);
        Jeager2.setSpeed(10);
        Jeager2.setStrength(10);
        Jeager2.setArmor(9);
        Jeager2.setWeapon1("Plasmacaster");
        Jeager2.setWeapon2("Chain Sword");
        System.out.println("Jeager1: \n " + Jeager1.getModelName() + "\n Mark: " + Jeager1.getMark() 
                + "\n Origin: " + Jeager1.getOrigin() + "\n Height: " + Jeager1.getHeight() + "\n Weight: " + 
                Jeager1.getWeight() + "\n Speed: " + Jeager1.getSpeed() + "\n Strength: " 
                + Jeager1.getStrength() + "\n Armor: " + Jeager1.getArmor());
        System.out.println("Jeager2: \n " + Jeager2.getModelName() + "\n Mark: " + Jeager2.getMark() 
                + "\n Origin: " + Jeager2.getOrigin() + "\n Height: " + Jeager2.getHeight() + "\n Weight: " + 
                Jeager2.getWeight() + "\n Speed: " + Jeager2.getSpeed() + "\n Strength: " 
                + Jeager2.getStrength() + "\n Armor: " + Jeager2.getArmor());
        // применение методов
        System.out.println(Jeager1.getModelName() + " " + Jeager1.scanKaiju() + "\n" + Jeager2.getModelName() 
                + " " + Jeager2.scanKaiju());
        String modelName1 = Jeager1.getModelName();
        Jeager1.Run(modelName1);
        Jeager2.Run(Jeager2.getModelName());
        System.out.println(Jeager1.getModelName() + " увеличивает скорость до: "
                + Jeager1.speedAccelerator(18));
        Jeager2.useWeapons(Jeager2.getModelName(), Jeager2.getWeapon2());
        Jeager1.useWeapons(Jeager1.getModelName(), Jeager1.getWeapon2());
        Jeager2.blowWithForce(Jeager2.getModelName());
        Jeager1.blowWithForce(Jeager1.getModelName());
        
        Jeager1.win(Jeager1.getModelName(), Jeager1.getArmor(), Jeager2.getModelName(), Jeager2.getArmor());
        System.out.println(Jeager2.win2(Jeager2.getModelName(), Jeager2.getArmor(), Jeager1.getModelName(), 
                Jeager1.getArmor()) + "!!!");
    }
}


