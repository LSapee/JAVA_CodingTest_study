package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        String s = "";
        for(int i=0; i<n; ++i){
            s = sb.append(bf.readLine()).reverse().toString();
            sb.delete(0,m);
            System.out.println(s);
        }
    }
}
