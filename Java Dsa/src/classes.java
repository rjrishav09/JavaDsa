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
            System.out.println("\n"+t + " * " + i + " = " + i*t);
        }

    }
}

class Array{
    public static void array(){
        String entery[] = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        for(int i =0;i<entery.length;i++){
            entery[i] = sc.nextLine();
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


