package bronze05;

import java.util.Scanner;

public class VeryRich2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String a= sc.next();
       String b= sc.next();
       int c = a.length()-b.length();
       double d = Math.pow(10,c);
       System.out.println((int)d);
       System.out.println(0);


    }
}
