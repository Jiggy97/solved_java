package Silver;

import java.util.Scanner;

public class S2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String c : croatia) {
            if(word.contains(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
