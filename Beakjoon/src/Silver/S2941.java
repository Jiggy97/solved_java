package Silver;

import java.util.List;
import java.util.Scanner;

public class S2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] words = word.split("");
        int count = 0;
        List<String> croatia = List.of(new String[]{"c=", "c-", "d-", "lj", "nj", "s=", "z="});

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
                count ++;
                i++;
                continue;
            }

            if (w2.equals("dz=")) {
                count++;
                i += 2;
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
