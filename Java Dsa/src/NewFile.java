import java.util.Scanner;

/**
 * NewFile
 */
public class NewFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Please enter your array: ");
        for(int i=0;i<10;i++){
            
            nums[i] = scan.nextInt(); 
        }
        for(int i=0;i<10;i++){
            System.out.println("Your enter array is: " + nums[i]);
        }
     }
}