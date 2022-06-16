package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num5464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int Rs[] = new int[n];
        int Wk[] = new int[m];
        int sum =0; //비용
        for(int i=0; i<Rs.length;++i){
            Rs[i] = sc.nextInt();
        }
        for(int i=0; i<Wk.length;++i){
            Wk[i] = sc.nextInt();
        }
        int count = 0; //차량 확인
        int l =0;
        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i<m*2; ++i){
            int c = sc.nextInt();
                if(c>=0){
                    que.add(c);
                    ++count;
                    ++l;
                }else if(c<0){
                    c = Math.abs(c);
                    sum += Rs[l]*Wk[c-1];
                    --l;
                    que.poll();
                }
                if(que.isEmpty()){
                    break;
                }
        }
        System.out.println(sum);
    }
}
