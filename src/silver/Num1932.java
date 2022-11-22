package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1932{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n =Integer.parseInt(bf.readLine());
        int [][] dp = new int[n][n];
        int [][] triangle = new int[n][n];
        int a = 1;
        triangle[0][0] = Integer.parseInt(bf.readLine());
        for(int i=1; i<n; ++i){
            st = new StringTokenizer(bf.readLine());
            for(int j =0; j<n; ++j){
                if(j<i+a){
                    triangle[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        dp[0][0] = triangle[0][0];
        for(int i=1; i<n; ++i){
            dp[i][0] = triangle[i][0] + dp[i - 1][0];

            for (int j=1; j<i+1; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i -1][j - 1], dp[i -1][j]);
            }
        }
        int max = 0;
        for (int i=0; i<dp[dp.length - 1].length; i++) {
            max = Math.max(dp[dp.length - 1][i], max);
        }
        System.out.println(max);
    }
}
