package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());
        for(int i=1; i<=n; ++i){
            String s =bf.readLine();
            sb.append(i).append(". ").append(s);
            if(i!=n){
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
