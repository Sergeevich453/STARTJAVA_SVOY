package HW;

public class JaegerA {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public String getModelName() {
        return modelName;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }
    
    public String getMark() {
        return mark;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public String getOrigin() {
        return origin;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    public int getArmor() {
        return armor;
    }
    
    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }
}

public class JaegerTestA {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Mark V", "Australia", 85.34f, 1.722f, 4, 9, 8);
        jaeger1.setModelName("Saber Athena");
        jaeger1.setMark("Mark III");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(81.77f);
        jaeger1.setWeight(1.609f);
        jaeger1.setSpeed(5);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);
        
        Jaeger jaeger2 = new Jaeger("Saber Athena", "Mark III", "China", 81.77f, 1.609f, 5, 8, 9);
        
        System.out.println(String.format("Jaeger1: %s %s %s %.2f %.3f %d %d %d",
                jaeger1.getModelName(),
                jaeger1.getMark(),
                jaeger1.getOrigin(),
                jaeger1.getHeight(),
                jaeger1.getWeight(),
                jaeger1.getSpeed(),
                jaeger1.getStrength(),
                jaeger1.getArmor()));
        
        System.out.println(String.format("Jaeger2: %s %s %s %.2f %.3f %d %d %d",
                jaeger2.getModelName(),
                jaeger2.getMark(),
                jaeger2.getOrigin(),
                jaeger2.getHeight(),
                jaeger2.getWeight(),
                jaeger2.getSpeed(),
                jaeger2.getStrength(),
                jaeger2.getArmor()));
    }
}