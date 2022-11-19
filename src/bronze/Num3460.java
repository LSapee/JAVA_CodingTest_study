package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; ++i){
            int a = Integer.parseInt(bf.readLine());
            String s ="";
            while(a>0){
                int b = a%2;
                a= a/2;
                s = s+b;
            }
            String ss[] = s.split("");
            for(int j=0; j<s.length(); ++j){
                if(ss[j].equals("1")){
                    sb.append(j).append(" ");
                }
            }
            if(i!=n-1){
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
