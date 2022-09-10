package silver;

import java.util.Scanner;

public class Num2581 {

    static boolean prime[] = new boolean[10001];

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        int min = Integer.MAX_VALUE;
        prime[0] = prime[1] = true;

        for(int i =2; i*i<=10000; ++i){
            if(!prime[i]){
                for(int j=i*i; j<=10000; j+=i) prime[j] = true;
            }
        }
        for(int i=n; i<=m; ++i){
            if(!prime[i]) {
                sum += i;
                min = Math.min(min,i);
            }
        }
        if(sum>0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}
