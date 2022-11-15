package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int count =0;
        for(int i=0; i<n; ++i){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j =a; j<=b; ++j){
                int d = j;
                while(d>=0){
                    int k = d%10;
                    d = d/10;
                    if(k==0){
                        ++count;
                    }
                    if(d==0){
                        break;
                    }
                }
            }
            System.out.println(count);
            count =0;
        }
    }
}
