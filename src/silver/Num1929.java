package silver;

import java.util.Scanner;

public class Num1929 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        StringBuilder sb = new StringBuilder();
        boolean[] prime = new boolean[m+1];

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=m; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=m; j+=i) prime[j] = true;
            }
        }

        // 소수 출력
        for(int i=n; i<=m;i++){
            if(!prime[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
