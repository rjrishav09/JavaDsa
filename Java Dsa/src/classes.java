class Display {
    public static void display() {
        System.out.println("Welcome");
    }
}

public class classes {
    public static void main(String[] args) {
        Display d = new Display();
        d.display(); // Call the static method from the Display class
    }
}
