package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][m];
        int arr2[][] = new int[n][m];

        for(int i=0; i<n; ++i){
            st =new StringTokenizer(bf.readLine());
            for(int j =0; j<m; ++j){
                int a = Integer.parseInt(st.nextToken());
                arr[i][j] = a;
            }
        }
        for(int i=0; i<n; ++i){
            st =new StringTokenizer(bf.readLine());
            for(int j =0; j<m; ++j){
                int a = Integer.parseInt(st.nextToken());
                arr[i][j] += a;
                if(j==m-1){
                    sb.append(arr[i][j]);
                    break;
                }
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
