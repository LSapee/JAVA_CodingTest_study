package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Num8437 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = a.subtract(b);
        a = c.divide(new BigInteger("2"));
        b = a.add(b);
        System.out.println(b);
        System.out.println(a);
    }
}
