package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count =0;
        st =new StringTokenizer(bf.readLine());
        for(int i=0; i<5; ++i){
            int a =Integer.parseInt(st.nextToken());
            if(a==n){
                ++count;
            }
        }
        System.out.println(count);
    }
}
