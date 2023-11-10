import java.util.Scanner;

class Display {
    public static void display() {
        System.out.println("Thanks for Your Answers!");
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
class Table{
    public static void table(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter YOur number");
        int t = scan.nextInt();
        for(int i =1;i<11;++i){
            System.out.println(t + " * " + i + " = " + i*t);
        }

    }
}

public class classes {
    public static void main(String[] args) {
        Display d = new Display();
        Inputs k = new Inputs();
        Table p = new Table();
        k.inputs();
        d.display(); 
        p.table();
    }
}


