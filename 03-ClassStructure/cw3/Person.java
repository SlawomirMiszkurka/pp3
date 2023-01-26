public class Person {
    private String name;
    private double weight;
    private double height;

    //constructor
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    //setters
    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    //methods
    public double calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    public void displayRecord() {
        double bmi = calculateBMI();
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("BMI too low");
        } else if (bmi > 24.9) {
            System.out.println("BMI too high");
        }
    }
}
