package bronze;

import java.util.Scanner;

public class CopyRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b = sc.nextInt()-1;

        System.out.println(a*b+1);
    }
}
