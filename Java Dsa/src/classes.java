import java.util.Scanner;

class Display {
    public static void display() {
        System.out.println("Welcome");
    }
}

class Inputs{
    public static int inputs(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int a = scan.nextInt();
        return a;
        
    }
}

public class classes {
    public static void main(String[] args) {
        Display d = new Display();
        Inputs k = new Inputs();
        k.inputs();
        d.display(); // Call the static method from the Display class
    }
}


