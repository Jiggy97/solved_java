package Bronze;

import java.util.Scanner;

public class B3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] ches = input.split(" ");
        int[] a = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < a.length; i++) {
            int c = Integer.parseInt(ches[i]);
            System.out.print(a[i] - c);
            System.out.print(" ");

        }
    }
}
