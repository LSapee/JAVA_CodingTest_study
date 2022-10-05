package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n =Integer.parseInt(st.nextToken());
        List<Stu> al = new ArrayList<>();

        for(int i=0; i<n; ++i){
            st = new StringTokenizer(bf.readLine());
            int a =Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            al.add(new Stu(a,s));
        }
        Collections.sort(al, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                return o1.getAge() -o2.getAge();
            }
        });
        for(int i=0; i<n; ++i){
            sb.append(al.get(i).getAge()).append(" ").append(al.get(i).getName()).append("\n");
        }
        System.out.println(sb);
    }
}
