package Silver;

import java.util.Scanner;

public class S16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;

        while (a < b) {
            count++;
            if (b % 2 == 0) {
                b /= 2;
            } else {
                if (b % 10 != 1) break;
                if (b < 10) break;
                b /= 10;
            }
        }

        if (a == b) System.out.println(count);
        else System.out.println(-1);
    }
}
