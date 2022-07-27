package bronze;

import java.util.Scanner;

public class Num10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        a = a+b;
        c= c+d;
        long n =Long.parseLong(a);
        long m =Long.parseLong(c);
        System.out.println(n+m);
    }
}
