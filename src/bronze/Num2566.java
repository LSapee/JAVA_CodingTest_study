package bronze;

import java.util.Scanner;

public class Num2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int countA = 0;
        int countB = 1;
        int maxA= 0;
        int maxB=0;
        for(int i =0; i<81; ++i){
            int a = sc.nextInt();
            max = Math.max(max,a);
            ++countA;
            if(max ==a){
                maxA=countA;
                maxB=countB;
            }
            if(countA==9){
                countA=0;
                ++countB;
            }
        }
        System.out.println(max);
        System.out.println(maxB+" "+maxA);
    }
}
