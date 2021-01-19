package java_basic;
import java.util.Scanner;

public class series_print{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter limit of series: ");
        int n = input.nextInt();
        int i;
        for(i = 1; i<=n-2; i+=2){
            System.out.print(i+"^2+");
        }
        System.out.print(i+"^2");
    }
}

// import java.util.Scanner; 
// class example 
// { 
// 	public static void main(String args[]) 
// 	{ 
// 		Scanner in=new Scanner(System.in); 
// 		System.out.print("Enter limit of series : "); 
// 		int limit=in.nextInt(); 
// 		int i=1; 
// 		while(i<=limit) 
// 		{ 
// 			if(i!=1) 
// 			{ 
// 				System.out.print(" + "); 
// 			} 
// 			System.out.print(i+++"/"+i); 
// 		} 
// 	} 
// } 