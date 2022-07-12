package gold;

import java.util.Scanner;

public class Num1407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(fx(b)-fx(a-1));
    }
    static long fx(long l){
        long sum =0;
        long x;
        long y =1;

        while(l>0){
            if(l%2==0){
                x = l/2;
            }else {
                x = l/2+1;
            }
            sum += x*y;
            l -= x;
            y*=2;
        }
        return sum;
    }
}
