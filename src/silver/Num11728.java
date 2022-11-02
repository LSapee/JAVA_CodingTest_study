package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Num11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        int arr2[] = new int[m];
        ArrayList<Integer> al = new ArrayList<>();

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; ++i){
            int a = Integer.parseInt(st.nextToken());
            al.add(a);
        }
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; ++i){
            int a = Integer.parseInt(st.nextToken());
            al.add(a);
        }
        Collections.sort(al);
        for(int i=0; i<al.size(); ++i){
            sb.append(al.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
