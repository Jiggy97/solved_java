package Silver;

import java.util.ArrayList;
import java.util.Scanner;

public class S1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String word = sc.nextLine();
            if (word.isEmpty()) continue;
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        String[] wordArray = word.split("");

        for (String a : wordArray) {
            ArrayList<Integer> idx = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                if (a.equals(wordArray[i])) {
                    idx.add(i);
                }
            }
            if (idx.size() == 1) continue;
            for (int i = 0; i < idx.size() - 1; i++) {
                if (idx.get(i + 1) - idx.get(i) != 1) return false;
            }
        }

        return true;
    }
}
