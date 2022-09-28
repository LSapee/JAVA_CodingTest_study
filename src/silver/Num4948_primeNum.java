package silver;

import java.util.Scanner;

public class Num4948_primeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = 123456;
        boolean[] prime = new boolean[a*2+1];

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=a*2; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=a*2; j+=i) prime[j] = true;
            }
        }
        int count =0;
        // 소수 출력
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int m =n*2;
            for(int i=n+1; i<=m;i++){
                if(!prime[i]){
                    ++count;
                }
            }
            sb.append(count).append("\n");
            count =0;
        }

        System.out.println(sb);
    }
}
