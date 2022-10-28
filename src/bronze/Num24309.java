package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Num24309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        BigInteger big = new BigInteger(s);
        BigInteger big2 = new BigInteger(s1);
        BigInteger big3 = new BigInteger(s2);
        System.out.println(big2.subtract(big3).divide(big));
    }
}
