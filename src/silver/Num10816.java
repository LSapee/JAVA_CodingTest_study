package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb =new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; ++i){
            int a = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(a)){
                hashMap.put(a,hashMap.get(a)+1);
            }else{
                hashMap.put(a,1);
            }
        }
        int m =Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; ++i){
            int a = Integer.parseInt(st.nextToken());
            if(hashMap.get(a)==null){
                sb.append(0).append(" ");
            }else{
                sb.append(hashMap.get(a)).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

}
