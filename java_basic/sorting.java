package java_basic;
import java.util.Scanner;

public class sorting{
    public static void bubble_sort(int []A,int n){
        int i,j,temp;
        for(i = 0; i<n; i++){
            for(j = 0; j < n-i-1; j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int n = input.nextInt();
        int []array = new int[n];
        System.out.println("Input the elements of the array");
        int i;
        for(i = 0; i<n; i++){
            array[i] = input.nextInt();
        }
        bubble_sort(array, n);
        System.out.println("Sorted array is:");
        for(i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}