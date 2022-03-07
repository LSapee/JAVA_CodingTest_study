package bronze;

import java.util.Scanner;

public class Num1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int h =sc.nextInt();
        a = Math.min(a, w-a);
        b = Math.min(b,h-b);
        System.out.println(Math.abs(Math.min(a,b)));
    }
}
