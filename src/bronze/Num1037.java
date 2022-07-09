package bronze;

import java.util.Scanner;

public class Num1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int a[] = new int[n];
        for(int i =0; i<n; ++i){
            a[i] = sc.nextInt();
            min= Math.min(min,a[i]);
            max= Math.max(max,a[i]);
        }
        long answer = min*max;
        System.out.println(answer);
    }
}
