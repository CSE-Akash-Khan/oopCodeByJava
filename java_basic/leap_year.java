package java_basic;
import java.util.Scanner;

public class leap_year{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = input.nextInt();
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is leap year.");
        }
        else if(year % 100 == 0 && year % 4 == 0){
            if(year % 400 == 0){
                System.out.println(year + " is leap year.");
            }
        }
        else{
            System.out.println(year + " is not leap year");
        }
    }
}