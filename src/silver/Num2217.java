package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int b[] = new int[n];
        int max = Integer.MIN_VALUE;
        int count =1;
        for(int i=0; i<n; ++i){
            int a = sc.nextInt();
            b[i] =a;
        }
        Arrays.sort(b);

        for(int i=b.length-1; i>=0; --i){
            int a = b[i]*count;
            ++count;
            max = Math.max(a,max);
        }
        System.out.println(max);
    }
}
