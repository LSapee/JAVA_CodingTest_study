package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num18414 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int min =Integer.MAX_VALUE;
        int result =0;
        for(int i=l; i<=r; ++i){
            int a = Math.abs(x-i);
            if(min>a){
                min = Math.min(min,a);
                result=i;
            }
        }
        System.out.println(result);
    }
}
