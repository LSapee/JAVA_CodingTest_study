package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Num2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; ++i){
            StringTokenizer st =new StringTokenizer(bf.readLine());
            ArrayList<Integer> al = new ArrayList<>();
            while(st.hasMoreTokens()){
                int k = Integer.parseInt(st.nextToken());
                al.add(k);
            }
            Collections.sort(al);
            sb.append(al.get(al.size()-3)).append("\n");
        }
        System.out.println(sb);
    }
}
