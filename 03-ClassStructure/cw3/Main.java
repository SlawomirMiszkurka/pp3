public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        person1.setWeightAndHeight(80, 1.7);
        person1.displayRecord();

        Person person2 = new Person("Mia", 60, 1.5);
        person2.displayRecord();

        Person person3 = new Person("Adam", 90, 1.8);
        person3.displayRecord();
    }
}