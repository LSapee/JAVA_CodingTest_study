package bronze;

import java.util.Scanner;

public class Num14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        int count =0;
        while(c>=b){
            c-=b;
            count++;
        }
        System.out.printf("%d %d",count,c);
    }
}
