package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n =Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int num =0;
        for(int i=0; i<n; ++i){
            StringTokenizer st =new StringTokenizer(bf.readLine());;
            String s= st.nextToken();
            if(s.equals("push")){
                int a =  Integer.parseInt(st.nextToken());
                num =a;
                queue.add(num);
            }else if(s.equals("pop")){
                if(!queue.isEmpty()){
                    sb.append(queue.poll()+"\n");
                }else{
                    sb.append(-1+"\n");
                }
            }else if(s.equals("size")){
                sb.append(queue.size()+"\n");
            }else if(s.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1+"\n");
                }else{
                    sb.append(0+"\n");
                }
            }else if(s.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1+"\n");
                }else {
                    sb.append(queue.peek()+"\n");
                }
            }else if(s.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1+"\n");
                }else{
                    sb.append(num+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
