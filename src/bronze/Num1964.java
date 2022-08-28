package bronze;

import java.util.Scanner;

public class Num1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 1;
        for(int i=1; i<=n; ++i){
            int a = i*3+1;
            sum += a;
        }
        System.out.println(sum%45678);
    }
}
