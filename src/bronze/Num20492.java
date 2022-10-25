package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int a = n-(n/100*22);
        int b = n-(n/10*8);
        b = n-(b/100*22);
        System.out.printf("%d %d",a,b);
    }
}
