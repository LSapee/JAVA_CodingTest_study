package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num10867 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(bf.readLine());
        StringBuilder sb =new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>();
        st =new StringTokenizer(bf.readLine());
        int b =0;
        for(int i=0; i<n; ++i){
            int a =Integer.parseInt(st.nextToken());
            al.add(a);
        }
        Collections.sort(al);
        for(int i=0; i<al.size(); ++i){
            if(b != al.get(i)){
                sb.append(al.get(i)).append(" ");
                b= al.get(i);
            }
        }
        System.out.println(sb);
    }
}
