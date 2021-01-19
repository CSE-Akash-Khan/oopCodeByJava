package java_basic;
import java.util.Scanner;

public class largest_number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int n = input.nextInt();
        int []array = new int[n];
        System.out.println("Input the elements of the array");
        int i,large_number = 0;
        for(i = 0; i<n; i++){
            array[i] = input.nextInt();
        }
        for(i = 0; i<n; i++){
            if(array[i] > large_number){
                large_number = array[i];
            }
        }
        System.out.println("Largest number of this array is: "+large_number);
    }
}