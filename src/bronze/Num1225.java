package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String s = st.nextToken();
        long sum =0;
        if(s.equals("0")){

        }else{
            String ss = st.nextToken();
            String s1[] = s.split("");
            String s2[] = ss.split("");
            for(int i=0; i<s1.length; ++i){
                int a = Integer.parseInt(s1[i]);
                for(int j=0; j<s2.length; ++j){
                    int b  = Integer.parseInt(s2[j]);
                    sum += a*b;
                }
            }
        }

        System.out.println(sum);

    }
}
