package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num19947 {
    public static int recursion(int x, int y){
        if(y>=5){
            y-=5;
            x =(int)(x*1.35);
        }else if(y>=3){
            y-=3;
            x=(int)(x*1.2);
        }else if(y>=1){
            y-=1;
            x=(int)(x*1.05);
        }else{
            return x;
        }
        return recursion(x,y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.println(recursion(x,y));
    }
}
