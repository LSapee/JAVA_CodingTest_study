package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n =0;
        int sum =0;

        while(0<1){
            n=Integer.parseInt(bf.readLine());
            if(n==-1){
                break;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}
