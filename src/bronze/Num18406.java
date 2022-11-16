package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = s.length();
        String ss[] = s.split("");
        int sum =0;
        int sum2 = 0;
        for(int i=0; i<n/2; ++i){
            sum += Integer.parseInt(ss[i]);
            sum2 += Integer.parseInt(ss[i+n/2]);
        }
        if(sum== sum2){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }
    }
}
