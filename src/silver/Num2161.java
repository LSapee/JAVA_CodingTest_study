package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num2161 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList();
        int a =0;
        int b =0;
        StringBuilder sb =new StringBuilder();
        for(int i=1; i<=n;++i){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            sb.append(queue.poll()+" ");
            if(!queue.isEmpty()){
                b=queue.poll();
                queue.add(b);
            }
        }
        String s = sb.toString().trim();
        System.out.println(s);
    }
}
