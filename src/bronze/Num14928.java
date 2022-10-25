package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num14928  {
    public static void main(String[] args)throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        long n = 0;
        String a= "";
        for(int i=0; i<s.length(); ++i){
            long k = Long.parseLong(a+s.charAt(i));
            a = k%20000303 +"";
        }
        System.out.println(a);
    }
}
