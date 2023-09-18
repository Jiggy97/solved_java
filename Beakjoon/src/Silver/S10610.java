package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ns = br.readLine();
        System.out.println(max30(ns));
    }

    public static String max30(String ns) {
        if (!ns.contains("0")) return "-1";
        char[] charArray = ns.toCharArray();
        Arrays.sort(charArray);
        int len = charArray.length;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            sum += charArray[i];
            sb.append(charArray[i]);
        }
        if (sum % 3 != 0) return "-1";


        return sb.toString();
    }
}
