package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(bf.readLine());

        int sum =1;
        for(int i=2; i<n/3-1; ++i){
            sum +=i;
        }
        System.out.println(sum);
    }
}
