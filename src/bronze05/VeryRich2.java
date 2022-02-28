package bronze05;

import java.math.BigDecimal;
import java.util.Scanner;

public class VeryRich2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());

        System.out.println(a.divide(b,0,BigDecimal.ROUND_DOWN));
        System.out.println(a.remainder(b));

    }
}
