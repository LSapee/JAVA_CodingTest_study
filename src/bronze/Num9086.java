package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9086 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; ++i){
            String s = bf.readLine();
            sb.append(s.substring(0,1)).append(s.substring(s.length()-1,s.length())).append("\n");
        }
        System.out.println(sb);
    }
}
