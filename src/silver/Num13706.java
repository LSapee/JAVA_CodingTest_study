package silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Num13706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        BigInteger num = new BigInteger("2");
        BigInteger a = new BigInteger("1");

        BigInteger bn = new BigInteger(n);
        BigInteger max =bn;
        BigInteger k = new BigInteger("1");
        BigInteger mid;
        int i=10;
        while(true){
           mid = k.add(max);
           mid = mid.divide(num);
           int result = (mid.multiply(mid)).compareTo(bn);
           if(result==0) break;
           else if(result ==1){
               max = mid.subtract(a);
           }else{
               k=mid.add(a);
           }
        }
        System.out.println(mid);
    }
}