package java_basic;
import java.util.Scanner;

public class power{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a base: ");
        int base = input.nextInt();
        System.out.print("Give a power: ");
        int power = input.nextInt();
        double value = Math.pow(base, power);
        System.out.println(value);
    }
}