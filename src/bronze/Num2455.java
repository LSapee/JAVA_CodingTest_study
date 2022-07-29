package bronze;

import java.util.Scanner;

public class Num2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<4; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += b;
            sum -= a;
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
