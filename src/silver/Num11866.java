package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k =0;
        String s ="<";
        int num =0;
        for(int i=1; i<=n; ++i){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            num = queue.poll();
            ++k;
            if(queue.isEmpty()){
                s =  s+num+">";
                break;
            }
            if(k==m){
                s = s+num+", ";
                k=0;
            }else{
                queue.add(num);
            }

        }
        System.out.println(s);
    }
}
