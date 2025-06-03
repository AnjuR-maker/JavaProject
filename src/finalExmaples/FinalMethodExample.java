package finalExmaples;
class ParentClass {
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }
}

class ChildClass extends ParentClass {
    // Uncommenting the following method will cause a compilation error
    // @Override
    // public void displayMessage() {
    //     System.out.println("Cannot override final method.");
    // }

}

public class FinalMethodExample {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.displayMessage();
        ChildClass child = new ChildClass();
        child.displayMessage();
    }
}