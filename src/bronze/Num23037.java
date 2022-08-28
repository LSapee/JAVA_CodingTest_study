package bronze;

import java.util.Scanner;

public class Num23037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ss[] = s.split("");
        int sum =0;
        int a =Integer.parseInt(ss[0]);
        int b =Integer.parseInt(ss[1]);
        int c =Integer.parseInt(ss[2]);
        int d =Integer.parseInt(ss[3]);
        int e =Integer.parseInt(ss[4]);
        for(int i=0; i<4; ++i){
            a*=Integer.parseInt(ss[0]);
            b*=Integer.parseInt(ss[1]);
            c*=Integer.parseInt(ss[2]);
            d*=Integer.parseInt(ss[3]);
            e*=Integer.parseInt(ss[4]);
        }
        sum = a+b+c+d+e;
        System.out.println(sum);
    }
}
