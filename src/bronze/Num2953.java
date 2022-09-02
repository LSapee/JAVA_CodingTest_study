package bronze;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Num2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum =0;
        int cookscore[] = new int[5];
        int count = 0;
        int maxscore = Integer.MIN_VALUE;
        for(int i=1; i<=20; ++i){
            int a = sc.nextInt();
            sum += a;
            if(i%4==0){
                cookscore[count] = sum;
                sum=0;
                ++count;
            }
        }
        for(int i=0; i<5; ++i){
            maxscore = Math.max(maxscore,cookscore[i]);
            if(maxscore==cookscore[i]){
                count=i+1;
            }
        }
        System.out.println(count+" "+maxscore);
    }
}
