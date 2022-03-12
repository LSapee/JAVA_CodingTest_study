package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        int sum =0;
        int lsum = 0;
        for(int i =0; i<testcase; i++){
            int f = sc.nextInt();//층수
            int p = sc.nextInt();//호수
            int all[][] = new int[f][p];
            for(int j =0; j<p; j++){
                all[0][j] = j+1;
            }
            for(int j = 0; j<f; j++){
                all[j][0] = 1;
            }
            for(int j=1; j<f; j++){
                for(int k=0;k<p;k++){
                    sum += all[j][k];
                }
                System.out.println(sum);
            }

            System.out.println(Arrays.toString(all[0]));
            System.out.println(Arrays.toString(all[1]));
            System.out.println(Arrays.toString(all[2]));

            int answer = all[f-1][p-1];
            System.out.println(answer);
        }
    }
}
