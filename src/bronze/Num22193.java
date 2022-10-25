package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Num22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String s= bf.readLine();
        String s1= bf.readLine();
        BigInteger big = new BigInteger(s);
        System.out.println(big.multiply(new BigInteger(s1)));
    }
}
