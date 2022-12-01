package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; ++i){
            st = new StringTokenizer(bf.readLine());
            int m = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int gap = Integer.MIN_VALUE;
            int arr[] = new int[m];
            sb.append("Class ").append(i).append("\n");
            for(int j=0; j<m; ++j){
                int a = Integer.parseInt(st.nextToken());
                arr[j] = a;
                max = Math.max(max,a);
                min = Math.min(min,a);
            }
            Arrays.sort(arr);
            for(int j=0; j<m-1; ++j){
                int a = arr[j+1]-arr[j];
                gap = Math.max(gap,a);
            }
            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap).append("\n");
        }
        System.out.println(sb);
    }
}
