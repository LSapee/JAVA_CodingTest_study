package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count = n/5;
        if(n>1&&n!=3){//2원과 5원으로 거슬러 줄 수 없는 예외 1월,3원을 제외한 수
            n =n%5;
            while(n!=0){
                if(n>1){
                    n-=2;
                    count++;
                }else{
                    n+=5;
                    count--;
                }
            }
        }else{
            count = -1;
        }

        System.out.println(count);
    }
}
