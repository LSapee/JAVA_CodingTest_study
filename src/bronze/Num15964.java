package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long n= Long.parseLong(st.nextToken());
        long m= Long.parseLong(st.nextToken());
        long k = (n+m)*(n-m);
        System.out.println(k);
    }
}
