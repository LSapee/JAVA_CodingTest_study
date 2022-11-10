package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num19698 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(st.nextToken());
        int w= Integer.parseInt(st.nextToken());
        int h= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        w= w/m;
        h = h/m;
        m= w*h;
        if(m>=n){
            System.out.println(n);
        }else{
            System.out.println(m);
        }
    }
}
