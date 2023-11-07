import java.util.Scanner;


public class inpitstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name[] = new String[2];
        System.out.println("Enter your name: ");
        for(int i =0;i<name.length;i++){
            name[i] = scan.nextLine();
        }
        for(int i=0;i<name.length;i++){

            System.out.println("Your name is:  " + name[i] + ";");
        }
    }
    
}
