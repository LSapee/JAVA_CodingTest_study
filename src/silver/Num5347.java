package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; ++i){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            int c =-1;
            while(c!=0){
                c =max%min;
                max =min;
                min =c;
            }
            System.out.println(a*(b/max));
        }
    }
}
