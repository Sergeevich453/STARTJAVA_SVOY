package hw;
public class Wolf2 {
    
    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public Wolf2(String gender, String nickname, int weight, int age, String color) {
        this.gender = gender;
        this.nickname = nickname;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public String walk() {
        return "Волк идет!";
    }

    public String sit() {
        return "Волк сел!";
    }

    public String run() {
        return "Волк бежит!";
    }

    public String howl() {
        return "Волк воет: У-У-У!";
    }

    public boolean hunt() {
        return true;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Возраст волка введен некорректно.");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}