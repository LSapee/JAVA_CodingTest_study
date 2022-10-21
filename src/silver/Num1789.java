package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        int count =0;
        for(long i=1 ; i<=n; ++i){
            n -=i;
            count++;
            if(n==0){
                break;
            }else if(n<0){
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}
