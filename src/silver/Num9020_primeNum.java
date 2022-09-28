package silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Num9020_primeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int a = 100000;
        boolean[] prime = new boolean[a+1];

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=a; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=a; j+=i) prime[j] = true;
            }
        }
        int count =0;
        // 소수 출력
        for(int i=0; i<n;++i){
            int m =sc.nextInt();
            int f =0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=1; j<=m;j++){
                if(!prime[j]){
                    al.add(j);
                }
            }
            for(int j=m/2; j>0; --j){
                for(int k =0; k<al.size(); ++k){
                    if(al.get(k)==j){
                        f=al.get(k);
                        break;
                    }
                }
                if(f>0 && al.contains(m-f)){
                    break;
                }
            }
            sb.append(f).append(" ").append(m-f).append("\n");
        }
        System.out.println(sb);
    }
}
