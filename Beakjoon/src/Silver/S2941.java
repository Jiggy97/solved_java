package Silver;

import java.util.List;
import java.util.Scanner;

public class S2941 {
    public static void main(String[] args) {
        List<String> croatia = List.of(new String[]{"c=", "c-", "d-", "lj", "nj", "s=", "z="});
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        mySolution(word, croatia);
        otherSolution(word, croatia);
    }

    public static void otherSolution(String word, List<String> croatia) {
        for (String i: croatia) {
            word = word.replace(i, "*");
        }
        System.out.println(word.length());
    }

    public static void mySolution(String word, List<String> croatia) {
        String[] words = word.split("");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                count++;
                break;
            } else if (i == words.length - 2) {
                String w1 = words[i] + words[i+1];
                if (croatia.contains(w1)) {
                    count++;
                    break;
                }
                count++;
                continue;
            }
            String w1 = words[i] + words[i+1];
            String w2 = words[i] + words[i+1] + words[i+2];

            if (croatia.contains(w1)) {
                continue;
            }

            if (w2.equals("dz=")) {
                if (i == words.length - 3) {
                    count++;
                    break;
                }
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
