package bronze;

import java.util.Scanner;

public class Num1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int i=n; i<=m; ++i){
            for(int j=1; j<=100; ++j){
                if(j*j>i){
                    break;
                }else if(j*j==i){
                    sum = sum +i;
                    min = Math.min(min,i);
                    break;
                }
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
