package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Num10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n =Integer.parseInt(bf.readLine());
        int num =0;
        String s ="";
        String s1 = "";
        for(int i=0; i<n; ++i){
            s1 = bf.readLine();
            if(s1.contains(" ")){
                String ss[] = s1.split(" ");
                s = ss[0];
                num = Integer.parseInt(ss[1]);
            }else{
                s = s1;
            }


            if(s.equals("push")){
                queue.add(num);
            }else if(s.equals("pop")){
                if(!queue.isEmpty()){
                    System.out.println(queue.poll());
                }else{
                    System.out.println(-1);
                }
            }else if(s.equals("size")){
                System.out.println(queue.size());
            }else if(s.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(s.equals("front")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(queue.peek());
                }
            }else if(s.equals("back")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(num);
                }
            }
        }
    }
}
