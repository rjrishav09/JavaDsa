import java.util.Scanner;

public class string_array {

    public static void main(String[] args) {
        String data[] = new String[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of students :");
        for(int i =0;i<data.length;i++){
            data[i] =scan.nextLine();
        }
        for(int i=0; i<=data.length;i++){
            if(data[i]== "a"){
                System.out.println(i+1 + " : " + data[i]);
            }
            else{
                System.out.println("Try again");
            }
        }
    

    }
    
}
