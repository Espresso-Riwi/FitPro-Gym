public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String plan;
    private boolean firstTime;

    public Person(){

    }

    public Person(String name, int age, double height, double weight, String plan, boolean firstTime){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.plan = plan;
        this.firstTime = firstTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public boolean isFirstTime() {
        return firstTime;
    }

    public void setFirstTime(boolean firstTime) {
        this.firstTime = firstTime;
    }
}
