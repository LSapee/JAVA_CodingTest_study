package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num7891 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<n; ++i){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(i!=n-1){
                sb.append(a+b).append("\n");
            }else{
                sb.append(a+b);
            }
        }
        System.out.println(sb);
    }
}
