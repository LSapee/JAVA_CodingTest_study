package silver;

import java.util.LinkedList;
import java.util.Scanner;
//푸는중
public class Num1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i=0; i<n; ++i){
            int F = sc.nextInt();
            int L = sc.nextInt();

            LinkedList<int[]> que = new LinkedList<>();

            for(int j=0; j<F;++j){
                que.offer(new int[]{i,sc.nextInt()});
            }

           while(!que.isEmpty()){
               int fr[] = que.poll();
               boolean ok = false;

               for(int j=0; j<que.size(); ++j){

               }



           }
        }

    }
}
