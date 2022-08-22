package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Num10829 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        String s = sc.next();
        BigInteger bi = new BigInteger(s);
        BigInteger b2 = new BigInteger("2");
        BigInteger b0 = new BigInteger("0");
        String answer ="";
        while(bi.compareTo(b0)!=0){
            answer = bi.remainder(b2)+answer;
            bi = bi.divide(b2);
        }
        System.out.println(answer);
    }

}
