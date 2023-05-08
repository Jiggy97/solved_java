package Bronze;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class B10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] numbers = input.split(" ");
        int n = parseInt(numbers[0]);
        int m = parseInt(numbers[1]);
        int[] basket = new int[n];

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int x = 0; x < m; x++) {
            String[] spin = sc.nextLine().split(" ");
            int i = Integer.parseInt(spin[0]);
            int j = Integer.parseInt(spin[1]);
            int k = Integer.parseInt(spin[2]);

            int[] tmp1 = Arrays.copyOfRange(basket, 0, i - 1);
            int[] tmp2 = Arrays.copyOfRange(basket, k - 1, j);
            int[] tmp3 = Arrays.copyOfRange(basket, i - 1, k - 1);
            int[] tmp4 = Arrays.copyOfRange(basket, j, n);

            int idx = 0;
            for (int y : tmp1) {
                basket[idx] = y;
                idx++;
            }
            for (int y : tmp2) {
                basket[idx] = y;
                idx++;
            }
            for (int y : tmp3) {
                basket[idx] = y;
                idx++;
            }
            for (int y : tmp4) {
                basket[idx] = y;
                idx++;
            }

        }

        for (int z = 0; z < n; z++) {
            System.out.print(basket[z]);
            if (z != n-1) System.out.print(" ");
        }
    }
}
