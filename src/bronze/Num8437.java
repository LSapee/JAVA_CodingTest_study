package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Num8437 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        int c = a.remainder(BigInteger.TEN).intValue();

        if(c%2==0){
            a= a.divide(BigInteger.valueOf(2));
            b = b.divide(BigInteger.valueOf(2));
            System.out.println(a.add(b));
            System.out.println(a.subtract(b));
        }else{

        }
    }
}
