package java_basic;
import java.io.IOException;

import java.util.Scanner;

public class Consecutive_odd {
    public static void main(String[] args) throws IOException {
        int n;
        int n1, n2;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int total = 0;
            n1 = input.nextInt();
            n2 = input.nextInt();
            if (n1 > n2) {
                for (int j = n1 - 1; j > n2; j--) {
                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            } else if (n1 < n2) {
                for (int j = n1 + 1; j < n2; j++) {
                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            } else {
                total = 0;
            }
            System.out.println(total);
        }
    }
}
