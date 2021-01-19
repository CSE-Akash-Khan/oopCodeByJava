package java_basic;
import java.util.Scanner;

public class series_print2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter limit of series: ");
        int n = input.nextInt();
        int i;
        for(i = 1; i<=n; i++){
            if(i != 1 && i % 2 != 0){
                System.out.print("+");
            }
            else if(i % 2 == 0){
                System.out.print("-");
            }
            System.out.print(i);
        }
    }
}