package bronze;

import java.util.Scanner;

public class Num8370 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int acW = sc.nextInt();
        int buW = sc.nextInt();
        int acH = sc.nextInt();
        int buH = sc.nextInt();
        System.out.println(acW*acH+buW+buH);
    }
}
