package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num25591 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());

        int a = 100-n;
        int b = 100-m;
        int c = 100-(a+b);
        int d =a*b;
        int q=d/100;
        int r=d%100;
        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(q).append(" ").append(r).append("\n").append(c+q).append(" ").append(r).append(" ");

        System.out.println(sb);

    }
}
