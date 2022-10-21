package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Num5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = bf.readLine();
        BigInteger b = new BigInteger(s);
        BigInteger b2 = new BigInteger(s+"0000");
        b = b.add(b2);
        int a=0;
        String z = b.toString();
        String ss[] = z.split("");
        for(int i=ss.length-1; i>=0; i--){
            int n = Integer.parseInt(ss[i]);
            n = n+a;
            if(n>=2){
                n=n-2;
                a=1;
            }else {
                a=0;
            }
            sb.append(n);
        }
        if(a==1){
            sb.append(a);
        }
        System.out.println(sb.reverse());
    }
}
