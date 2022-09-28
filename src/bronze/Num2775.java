package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        int sum =0;

        for(int i=0; i<testcase; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[][] ho = new int[a+1][b];
            for(int j=0; j<=a;++j){
                for(int k=0; k<b; ++k){
                    if(j==0){
                        ho[j][k] = k+1;
                    }else{
                        for(int n =0; n<=k; ++n){
                            sum += ho[j-1][n];
                        }
                        ho[j][k] = sum;
                        sum =0;
                    }
                }
            }
            System.out.println(ho[a][b-1]);
        }
    }
}
