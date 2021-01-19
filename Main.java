////1113
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(System.in);
//        while (true){
//            int x = input.nextInt();
//            int y = input.nextInt();
//            if(x == y){
//                break;
//            }
//            else if(x < y){
//                System.out.println("Crescente");
//            }
//            else {
//                System.out.println("Decrescente");
//            }
//        }
//    }
//}

//todo: 1014
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(System.in);
//        int password = 2002;
//        while (true){
//            int n = input.nextInt();
//            if(n == password){
//                System.out.println("Acesso Permitido");
//                break;
//            }
//            else {
//                System.out.println("Senha Invalida");
//            }
//        }
//    }
//}

//todo: 1115
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(System.in);
//        while (true){
//            int x = input.nextInt();
//            int y = input.nextInt();
//            if(x == 0 || y == 0){
//                break;
//            }
//            else if(x > 0 && y > 0){
//                System.out.println("primeiro");
//            }
//            else if(x > 0 && y < 0){
//                System.out.println("quarto");
//            }
//            else if(x < 0 && y < 0){
//                System.out.println("terceiro");
//            }
////            else if(x < 0 && y > 0){
////                System.out.println("segundo");
////            }
//            else {
//                System.out.println("segundo");
//            }
//        }
//    }
//}

//todo: 1116
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for(int i = 0; i<n; i++){
//            int x = input.nextInt();
//            int y = input.nextInt();
//            double result = (double)x / y;
//            if(y == 0){
////            if(result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY){
//                System.out.println("divisao impossivel");
//            }
//            else {
//                System.out.println(String.format("%.1f",result));
//            }
//        }
//    }
//}

//todo: 1117
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner input  = new Scanner(System.in);
//        int n = 0;
//        double total = 0;
//        while (true){
//            if(n == 2){
//                System.out.println("media = " + String.format("%.2f",total / n));
//                break;
//            }
//            else {
//                double x = input.nextDouble();
//                if(x < 0 || x > 10){
//                    System.out.println("nota invalida");
//                }
//                else {
//                    total += x;
//                    n++;
//                }
//            }
//        }
//    }
//}

//todo 1118

//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(System.in);
//        int n = 1;
//        while (n != 2){
//            if(n == 1){
//                int total = 0;
//                double sum = 0;
//                while (total != 2){
//                    double x = input.nextDouble();
//                    if(x < 0 || x > 10){
//                        System.out.println("nota invalida");
//                    }
//                    else {
//                        sum += x;
//                        total++;
//                    }
//                }
//                System.out.printf("media = %.2f\n",sum / total);
//            }
//            System.out.println("novo calculo (1-sim 2-nao)");
//            n = input.nextInt();
//        }
//
//    }
//}

//todo: 1131
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(System.in);
//        int inter = 0;
//        int gremio = 0;
//        int count = 0;
//        int draw = 0;
//        int n = 1;
//        while (n != 2){
//            if(n == 1){
//                int x = input.nextInt();
//                int y = input.nextInt();
//                if(x > y){
//                    inter++;
//                }
//                else if(x < y){
//                    gremio++;
//                }
//                else {
//                    draw++;
//                }
//                count++;
//            }
//            n = input.nextInt();
//            System.out.println("Novo grenal (1-sim 2-nao)");
//        }
//        System.out.println(count + " grenais");
//        System.out.println("Inter:" + inter);
//        System.out.println("Gremio:" + gremio);
//        System.out.println("Empates:" + draw);
//        if(inter > gremio){
//            System.out.println("Inter venceu mais");
//        }
//        else if(inter < gremio){
//            System.out.println("Gremio venceu mais");
//        }
//        else {
//            System.out.println("Não houve vencedor");
//        }
//    }
//}

//todo: 1132
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int sum = 0;
//        if(x > y){
//            int temp = x;
//            x = y;
//            y = temp;
//        }
//        for(int i = x; i<=y; i++){
//            if(i % 13 != 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
//}

//todo: 1133
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if(x > y){
//            int temp = x;
//            x = y;
//            y = temp;
//        }
//        for(int i = x+1; i<y; i++){
//            if(i % 5 == 2 || i % 5 == 3){
//                System.out.println(i);
//            }
//        }
//    }
//}

//todo: 1134
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int alcool = 0, gasolina = 0,diesel = 0;
//        System.out.println("MUITO OBRIGADO");
//        while (true){
//            int n = sc.nextInt();
//            if(n == 1){
//                alcool++;
//            }
//            else if(n == 2){
//                gasolina++;
//            }
//            else if(n == 3){
//                diesel++;
//            }
//            else if(n == 4){
//                break;
//            }
//        }
//        System.out.println("Alcool: " + alcool);
//        System.out.println("Gasolina: " + gasolina);
//        System.out.println("Diesel: " + diesel);
//    }
//}

//todo: 1142
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = 1;
//        int l = 3;
//        int i;
//        for(i = 1; i<=n; i++){
//            int j = k;
//            while (j <= l){
//                System.out.print(j + " ");
//                j++;
//            }
//            System.out.print("PUM");
//            System.out.println();
//            k = j + 1; // k = 4 + 1
//            l = k + 2; // l = 5 + 2
//        }
//    }
//}

//todo: 1143
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i<= n; i++){
//            int first = i;
//            int second = i*i;
//            int third = first *  second;
//            System.out.println(first + " " + second + " " +third);
//        }
//    }
//}

//todo: 1144
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i<= n; i++){
//            int first = i;
//            int second = i*i;
//            int third = first *  second;
//            int third2 = first * second + 1;
//            System.out.println(first + " " + second + " " +third);
//            System.out.printf("%d %d %d\n",first,second +1,third2);
//        }
//    }
//}

//todo: 1145
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int temp = x;
//        for(int i = 1; i<=y; i++){
//            if(i != x){
//                System.out.print(i + " ");
//            }
//            else {
//                System.out.println(i);
//                x += temp;
//            }
//        }
//    }
//}

//todo: 1146
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            int x = sc.nextInt();
//            if(x == 0){
//                break;
//            }
//            else {
//                for(int i = 1; i<=x; i++){
//                    if(i != x){
//                        System.out.print(i + " ");
//                    }
//                    else {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }
//
//    }
//}

//todo: 1149
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int N = sc.nextInt();
//        int sum = 0;
//        while (N < 0 || N == 0){
//            N = sc.nextInt();
//        }
//        for (int i = 0; i < N; i++){
//            sum += i + A;
//        }
//        System.out.println(sum);
//    }
//}

// todo: 1150
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int z = sc.nextInt();
//        int k = 0;
//        int sum = 0;
//        while (z <= x){
//            z = sc.nextInt();
//        }
//        while (true){
//            int total = x + k;
//            k += x;
//            sum++;
//            x++;
//            if(total > z){
//                break;
//            }
//        }
//        System.out.println(sum);
//    }
//}

//todo: 1151
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int fibo;
//        int first = 0;
//        int second = 1;
//        for(int i = 0; i<n; i++){
//            if(i <= 1){
//                fibo = i;
//            }
//            else {
//                fibo = first + second;
//                first = second;
//                second = fibo;
//            }
//            if(i == n-1){
//                System.out.print(fibo);
//            }
//            else {
//                System.out.println(fibo + " ");
//            }
//        }
//    }
//}

////todo: 1153
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int multi = 1;
//        for (int i = n; i>=1; i--){
//            multi *= i;
//        }
//        System.out.println(multi);
//    }
//}

//todo: 1154
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        float count = 0;
//        float sum = 0;
//        while (true){
//            int n = sc.nextInt();
//            if(n < 0){
//                break;
//            }
//            else {
//                count++;
//                sum += n;
//            }
//        }
//        float average = sum / count;
//        System.out.printf("%.2f\n",average);
//    }
//}

// todo: 1155
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        float s = 0;
//        for (float i = 1; i <=100; i++){
//            s += 1 / i;
//        }
//        System.out.printf("%.2f\n",s);
//    }
//}

//todo: 1156
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        float s = 0;
//        for (float i = 1,j =1; i <=39; i+=2,j += j){
//            s += i / j;
//        }
//        System.out.printf("%.2f\n",s);
//    }
//}

//todo: 1157
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i<=n; i++){
//            if(n % i == 0){
//                System.out.println(i);
//            }
//        }
//    }
//}
//import java.io.IOException;
//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i<n; i++){
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int sum = 0;
//            if(x % 2 == 0){
//                for (int k = 0,j = x + 1; k<y; k++,j+=2){
//                    sum += j;
//                }
//            }
//            else {
//                for (int k = 0,j = x; k<y; k++,j+=2){
//                    sum += j;
//                }
//            }
//            System.out.println(sum);
//        }
//    }
//}

//todo: 1159
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            int x = sc.nextInt();
//            if (x == 0){
//                break;
//            }
//            else {
//                int sum = 0;
//                if(x % 2 != 0){
//                    for (int k = 0,j = x + 1; k<5; k++,j+=2){
//                        sum += j;
//                    }
//                }
//                else {
//                    for (int k = 0,j = x; k<5; k++,j+=2){
//                        sum += j;
//                    }
//                }
//                System.out.println(sum);
//            }
//        }
//    }
//}

//todo: 1160
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int p1,p2,year;
//        double g1,g2;
//        int n = sc.nextInt();
//        for (int i = 0; i<n; i++){
//            p1 = sc.nextInt();
//            p2 = sc.nextInt();
//            g1 = sc.nextDouble();
//            g2 = sc.nextDouble();
//            year = 0;
//            while (p1 <= p2){
//                p1 += (p1 * g1) / 100;
//                p2 += (p2 * g2) / 100;
//                year++;
//                if(year > 100){
//                    System.out.println("Mais de 1 seculo.");
//                    break;
//                }
//            }
//            if(year <= 100){
//                System.out.println(year + " anos.");
//            }
//        }
//    }
//}

//todo: 1164
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int sum,n;
//        for(int i = 0; i<T; i++){
//            n = sc.nextInt();
//            sum = 0;
//            for(int j = 1; j<=n; j++){
//                if(n % j == 0){
//                    sum += j;
//                }
//            }
//            if(sum == n*2){
//                System.out.println(n + " eh perfeito");
//            }
//            else {
//                System.out.println(n + " nao eh perfeito");
//            }
//        }
//    }
//}

//todo: 1165
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum,n;
        for(int i = 0; i<T; i++) {
            n = sc.nextInt();
            sum = 0;
            for (int j = 2; j<n; j++){
                if(n % j == 0){
                    sum++;
                }
            }
            if(sum == 0){
                System.out.println(n + " eh primo");
            }
            else {
                System.out.println(n + " nao eh primo");
            }
        }
    }
}