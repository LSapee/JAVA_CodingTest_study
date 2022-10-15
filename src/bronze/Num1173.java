package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int count =0;
        int count2 =0;
        int min = m;
        int max =M;

        while(count!=n){
            if(min+T>max){
                count=-1;
                break;
            }
            if(m+T<=max){
                ++count;
                m += T;
            }else{
                ++count2;
                m= m-R;
                if(m<min){
                    m=min;
                }
            }
        }
        System.out.println(count+count2);
    }
}
