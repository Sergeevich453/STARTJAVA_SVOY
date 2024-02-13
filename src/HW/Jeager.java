public class Jeager {

    String modelName;
    String mark;
    String origin;
    double height;
    double weight;
    int streingth;
    int armor;

    public Jeager() {
    }

    public Jeager(String modelName, String mark, String origin, double height, double weight, int streingth, 
            int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.streingth = streingth;
        this.armor = armor;
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

    public int getStreingth() {
        return streingth;
    }

    public int getArmor() {
        return armor;
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

    public void setStreingth(int streingth) {
        this.streingth = streingth;
    }

    public void setArmor(int armor) {
        this.armor = armor;
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
}