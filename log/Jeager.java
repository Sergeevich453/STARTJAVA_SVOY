public class Jeager {

    String modelName;
    String mark;
    String origin;
    double height;
    double weight;
    int strength;
    int speed;
    int armor;
    String weapon1; // = "Sting-Blades"  Plasmacaster
    String weapon2; //  Chest launcher  Chain Sword

    public Jeager() {
    }

    public Jeager(String modelName1, String mark1, String origin1, double height1, double weight1, int strength1, 
            int speed1, int armor1, String weapon1, String weapon2) {
        modelName = modelName1;
        mark = mark1;
        origin = origin1;
        height = height1;
        weight = weight1;
        strength = strength1;
        speed = speed1;
        armor = armor1;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }

    public String getWeapon1() {
        return weapon1;
    }

    public String getWeapon2() {
        return weapon2;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
    this.speed = speed;
    }

        public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setWeapon1(String weapon1) {
        this.weapon1 = weapon1;
    }

    public void setWeapon2(String weapon2) {
        this.weapon2 = weapon2;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scaning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }

    public void Run(String modelName) {
        System.out.println(modelName + " Бежит");
    }

    public void useWeapons(String modelName, String weapon2) {
        System.out.println(modelName + " Применяет " + weapon1);
    }


    public void win(String modelName1, int armor1, String modelName2, int armor2) {
        if(armor1 > armor2) {
            System.out.println(modelName2.shout(modelName2) + "\nПобедителем становится " + modelName1 + "!!!");
        } else if(armor2 > armor1) {
            System.out.println(modelName1.shout(modelName1) + "\nПобедителем становится " + modelName2 + "!!!");
        } else {
            System.out.println("НИЧЬЯ");
        }
    }

    public String win2(String modelName1, int armor1, String modelName2, int armor2) {
        String winner;
        if(armor1 > armor2) {
            winner = modelName1;
            //modelName2.shout(modelName2);
        } else if(armor2 > armor1) {
            winner = modelName2;
            //modelName1.shout(modelName1);
        } else {
            winner = "draw";
        }
        System.out.print("Победителем становится ");
        return winner;
    }

    public int speedAccelerator(int speed1) {
            speed += speed1;
            return speed;
    }

    public void blowWithForce(String modelName) {
        System.out.println(modelName + " " + "сильным ударом Хряяясь!!!");
    }

    public void shout(String modelName) {
        System.out.println(modelName + " А-А-А-А-А-А-А-А!!!");
    }


}
