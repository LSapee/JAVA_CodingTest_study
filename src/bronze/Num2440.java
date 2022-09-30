package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; ++i){
            for(int j=n; j>i; --j){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
