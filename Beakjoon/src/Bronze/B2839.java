package Bronze;

import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.print(count);
                break;
            } else {
                n -= 3;
                count++;
            }
        }
        if (n < 0) {
            System.out.print(-1);
        }
    }
}
