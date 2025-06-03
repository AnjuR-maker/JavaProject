package finalExmaples;

public class FinalVariableExample {
    public static void main(String[] args) {
        final int CONSTANT_VALUE = 100;
        System.out.println("Constant Value: " + CONSTANT_VALUE);

        // Uncommenting the following line will cause a compilation error
        // CONSTANT_VALUE = 200; // Error: Cannot assign a value to final variable
    }
}