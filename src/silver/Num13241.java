package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num13241 {

    static long uc(long n, long m){
        if(n%m==0){
            return m;
        }else{
            return uc(m,n%m);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long n =Long.parseLong(st.nextToken());
        long m =Long.parseLong(st.nextToken());
        long u = uc(n,m);
        System.out.println(n/u*m);

    }
}
