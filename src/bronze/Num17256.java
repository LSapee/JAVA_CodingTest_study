package bronze;

import java.util.Scanner;

public class Num17256 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x[] = new int[3];
        int z[] = new int[3];

        for(int i= 0; i<3; i++){
            x[i] = sc.nextInt();
        }
        for(int i= 0; i<3; i++){
            z[i] = sc.nextInt();
        }
        System.out.printf("%d %d %d",z[0]-x[2],z[1]/x[1],z[2]-x[0]);
    }
}
