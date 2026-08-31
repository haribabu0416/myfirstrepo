public class Main {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;

        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}
