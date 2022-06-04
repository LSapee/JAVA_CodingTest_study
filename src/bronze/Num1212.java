package bronze;

import java.io.*;
import java.util.*;

public class Num1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] firstOct = {"0", "1", "10", "11", "100", "101", "110", "111"};
        String[] oct = {"000","001","010","011","100","101","110","111"};
        int[] bi = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        sb.append(firstOct[bi[0]]);
        for (int i = 1; i < bi.length; i++)
            sb.append(oct[bi[i]]);
        System.out.print(sb);
    }
}
