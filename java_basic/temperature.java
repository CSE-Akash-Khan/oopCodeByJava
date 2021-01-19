package java_basic;
import java.util.Scanner;

public class temperature{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Fahrenheit: ");
        int F = input.nextInt();
        int celsius = (F - 32) * 5/9;
        System.out.println(F +" Fahrenheit = "+celsius+" Celsius");
    }
}