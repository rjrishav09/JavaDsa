import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.lang.String;



public class Array {
    public static void main(String[] args) {
        String nums[] = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        for(int i=0;i<nums.length;i++){
            nums[i] = scan.nextLine();
            
        }
        for(int i=0;i<nums.length;i++){
            System.out.println("Your enter names are : " + nums[i]);
            
        }
    }
}