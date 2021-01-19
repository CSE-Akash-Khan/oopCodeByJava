//1099
//import java.io.IOException;
//
//import java.util.Scanner;
//
//public class uri_judge {
//    public static void main(String[] args) throws IOException {
//        int n;
//        int n1, n2;
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            int total = 0;
//            n1 = input.nextInt();
//            n2 = input.nextInt();
//            if (n1 > n2) {
//                for (int j = n1 - 1; j > n2; j--) {
//                    if (j % 2 != 0) {
//                        total += j;
//                    }
//                }
//            }
//            else if (n1 < n2) {
//                for (int j = n1 + 1; j < n2; j++) {
//                    if (j % 2 != 0) {
//                        total += j;
//                    }
//                }
//            }
//            else {
//                total = 0;
//            }
//            System.out.println(total);
//        }
//    }
//}

//1101

//import java.io.IOException;
//import java.util.Scanner;
//
//public class uri_judge{
//    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        int i =1;
//        while (i != 0){
//            int count = 0;
//            int n1 = input.nextInt();
//            int n2 = input.nextInt();
//            if(n1 > 0 || n2 > 0){
//                break;
//            }
//            else if (n1 > n2){
//                int temp = n1;
//                n1 = n2;
//                n2 = temp;
//            }
//            for(int j = n1; j <= n2; j++){
//                count += j;
//                System.out.print(j+ " ");
//            }
//            System.out.println("Sum=" + count);
//        }
//    }
//}
import java.io.IOException;
import java.util.Scanner;

public class uri_judge{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true){
            int sum = 0;
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            if(n1 <= 0 || n2 <= 0){
                break;
            }
            else if(n1 > n2){
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            for(int i = n1; i <= n2; i++){
                sum += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + sum);
        }
    }
}