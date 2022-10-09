package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11778 {

    static final long mod = 1000000007;

    // 행렬곱
    static public long[][] productMatrix(long[][] A, long[][] B)
    {
        long[][] answer = new long[A.length][B[0].length];
        for (int i = 0; i < answer.length; i++)
        {
            for (int j = 0; j < answer[0].length; j++)
            {
                for (int k = 0; k < A[0].length; k++)
                {
                    answer[i][j] += A[i][k] * B[k][j];
                }
                answer[i][j] %= mod;
            }
        }
        return answer;
    }

    static long solve(long m)
    {
        if (m <= 1)
            return m;
        else
        {
            long ans[][] = { { 1, 0 }, { 0, 1 } }; // 단위행렬
            long a[][] = { { 1, 1 }, { 1, 0 } };

            while (m > 0)
            {
                if (m % 2 == 1)
                {
                    ans = productMatrix(ans, a);
                }
                a = productMatrix(a, a);
                m /= 2;
            }

            return ans[0][1];
        }
    }
//    유클리드 최대공약수
    static long uclud(long x, long y){
        if(y==0){
            return x;
        }else{
            return uclud(y,x%y);
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(bf.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long gcd = uclud(n,m);
        long res =solve(gcd);
        System.out.println(res);
    }
}
