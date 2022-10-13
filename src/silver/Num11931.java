package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Num11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; ++i){
            st= new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            al.add(num);
        }
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0; i<n; ++i){
            sb.append(al.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
