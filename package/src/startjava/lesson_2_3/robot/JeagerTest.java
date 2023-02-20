package src.startjava.lesson_2_3.robot;

public class JeagerTest {

    public static void main(String [] args) {
        Jeager jeager1 = new Jeager("Gipsy Danger", "Mark - 3", "USA", 79.25, 1.980, 7, 8, 6, "Sting-Blades", 
                "Chest launcher");
        Jeager jeager2 = new Jeager();
        jeager2.setModelName("Striker Eureka");
        jeager2.setMark("Mark - 5");
        jeager2.setOrigin("Australia");
        jeager2.setHeight(250);
        jeager2.setWeight(1.85);
        jeager2.setSpeed(10);
        jeager2.setStrength(10);
        jeager2.setArmor(9);
        jeager2.setWeapon1("Plasmacaster");
        jeager2.setWeapon2("Chain Sword");
        System.out.println("Jeager1: \n " + jeager1.getModelName() + "\n Mark: " + jeager1.getMark() 
                + "\n Origin: " + jeager1.getOrigin() + "\n Height: " + jeager1.getHeight() + "\n Weight: " + 
                jeager1.getWeight() + "\n Speed: " + jeager1.getSpeed() + "\n Strength: " 
                + jeager1.getStrength() + "\n Armor: " + jeager1.getArmor() + "\n Weapon1: " 
                + jeager1.getWeapon1() + "\n Weapon2: " + jeager1.getWeapon2());
        System.out.println("Jeager2: \n " + jeager2.getModelName() + "\n Mark: " + jeager2.getMark() 
                + "\n Origin: " + jeager2.getOrigin() + "\n Height: " + jeager2.getHeight() + "\n Weight: " + 
                jeager2.getWeight() + "\n Speed: " + jeager2.getSpeed() + "\n Strength: " 
                + jeager2.getStrength() + "\n Armor: " + jeager2.getArmor() + "\n Weapon1: " 
                + jeager2.getWeapon1() + "\n Weapon2: " + jeager2.getWeapon2());
        System.out.println(jeager1.getModelName() + " " + jeager1.scanKaiju() + "\n" + jeager2.getModelName() 
                + " " + jeager2.scanKaiju());
        String modelName1 = jeager1.getModelName();
        jeager1.Run(modelName1);
        jeager2.Run(jeager2.getModelName());
        System.out.println(jeager1.getModelName() + " увеличивает скорость до: "
                + jeager1.speedAccelerator(18));
        jeager2.useWeapons(jeager2.getModelName(), jeager2.getWeapon2());
        jeager1.useWeapons(jeager1.getModelName(), jeager1.getWeapon2());
        jeager1.blowWithForce(jeager1.getModelName());
        jeager2.blowWithForce(jeager2.getModelName());
        jeager1.shout(jeager1.getModelName());
        jeager1.win(jeager1.getModelName(), jeager1.getArmor(), jeager2.getModelName(), jeager2.getArmor());
        System.out.println(jeager2.win2(jeager2.getModelName(), jeager2.getArmor(), jeager1.getModelName(), 
                jeager1.getArmor()) + "!!!");
    }
}


