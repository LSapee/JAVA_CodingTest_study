package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num1452 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(bf.readLine());
        StringTokenizer st =  new StringTokenizer(bf.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=1;i<=100; ++i){
            map.put(i,0);
        }

        for(int i=0; i<n; i++){
            int a =Integer.parseInt(st.nextToken());
            int k = map.get(a);
            if(k==0){
                map.put(a,1);
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
