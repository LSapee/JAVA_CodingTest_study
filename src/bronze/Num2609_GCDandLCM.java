package bronze;

import java.util.Scanner;

public class Num2609_GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);
        int gcd = Math.min(a,b);
        int c =0;
        StringBuilder sb = new StringBuilder();
        while(max%gcd!=0){
            c = max%gcd;
            max =gcd;
            gcd= c;
        }
        int lcm = (a/gcd)*(b/gcd)*gcd;
        sb.append(gcd).append(" ").append(lcm);
        System.out.println(sb);
    }
}
