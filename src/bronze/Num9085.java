package bronze;

import java.util.Scanner;

public class Num9085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;++i){
            int k = sc.nextInt();
            for(int j=0; j<k; ++j){
                int a = sc.nextInt();
                sum+=a;
            }
            System.out.println(sum);
            sum =0;
        }
    }
}
