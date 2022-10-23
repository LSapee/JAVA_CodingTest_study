package bronze;

import java.util.Scanner;

public class Num4999 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String s2 = s.length()>=sc.next().length() ? "go":"no";
        System.out.println(s2);
    }
}
