package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int []arr = new int[31];

        for(int i=1; i<=28; ++i){
            int a= Integer.parseInt(bf.readLine());
            arr[a] = 1;
        }
        for(int i=1; i<=30; ++i){
            if(arr[i] ==0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
