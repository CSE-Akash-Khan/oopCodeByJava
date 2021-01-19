package java_basic;
import java.util.Scanner;

public class bangla_season{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of Bangla Month:-\nBoishakh,Jyoishtho,Ashar,Shrabon,Bhadro,Ashshin,Kartik,Ogrohayon,Poush,Magh,Falgun,Choitro");
        System.out.print("Input a bangla month to know the current Bangla season: ");
        String month = input.nextLine();
        switch (month) {
            case "Boishakh":
            case "Jyoishtho":
                System.out.println("Current season is: Grishsho.");
                break;
            case "Ashar":
            case "Shrabon":
                System.out.println("Current season is: Borsha.");
                break;
            case "Bhadro":
            case "Ashshin":
                System.out.println("Current season is: Shorod.");
                break;
            case "Kartik":
            case "Ogrohayon":
                System.out.println("Current season is: Hemonto.");
                break;
            case "Poush":
            case "Magh":
                System.out.println("Current season is: Sheet.");
                break;
            case "Falgun":
            case "Choitro":
                System.out.println("Current season is: Bosonto.");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}