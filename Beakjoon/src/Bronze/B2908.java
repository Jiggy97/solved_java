package Bronze;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        StringBuilder aSb = new StringBuilder(aStr);
        StringBuilder bSb = new StringBuilder(bStr);

        int reversedA = Integer.parseInt(aSb.reverse().toString());
        int reversedB = Integer.parseInt(bSb.reverse().toString());

        System.out.println(Math.max(reversedB, reversedA));
    }
}
