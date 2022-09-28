package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Num10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb =new StringBuilder();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(a);
        for(int i=0; i<n; ++i){
            sb.append(a[i]).append("\n");
        }
        System.out.println(sb);
    }
}
