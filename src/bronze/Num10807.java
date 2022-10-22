package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int count =0;
        for(int i=0; i<n; ++i){
            int a= Integer.parseInt(st.nextToken());
            if(a==m)
                count++;
        }
        System.out.println(count);
    }
}
