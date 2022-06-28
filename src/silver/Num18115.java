package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num18115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<n; ++i){
            al.add(Integer.parseInt(st.nextToken()));
        }
        Collections.reverse(al);
        Deque<Integer> dq = new ArrayDeque<>();
        int num = 1;
        int temp = 0;
        for(int i=0; i<n; ++i){
            int card = al.get(i);

            if(card ==1){
                dq.addFirst(num);
            }else if(card ==2){
                temp = dq.remove();
                dq.addFirst(num);
                dq.addFirst(temp);
            }else{
                dq.addLast(num);
            }
            ++num;
        }
        while(!dq.isEmpty()){
            sb.append(dq.remove()).append(" ");
        }
        System.out.println(sb.toString());
    }

}
