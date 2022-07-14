package bronze;

import java.util.Scanner;

public class Num10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int k = c-(n*m);
        if(k<0){
            System.out.println(Math.abs(k));
        }else{
            System.out.println(0);
        }
    }
}
