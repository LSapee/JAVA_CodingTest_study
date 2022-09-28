package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Num11653 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();

        boolean[] prime = new boolean[N+1];

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=N; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=N; j+=i) prime[j] = true;
            }
        }

        // 소수 출력
        for(int i=1; i<=N;i++){
            if(!prime[i]) al.add(i);
        }

        while(N>1){
            for(int i=0; i<al.size(); ++i){
                if(N%al.get(i) ==0){
                    N=N/al.get(i);
                    sb.append(al.get(i)).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
