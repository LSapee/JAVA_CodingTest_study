package bronze;

import java.util.Scanner;

public class Num24416 {
    int fib(int n) {
        if (n == 1 || n == 2)
         return 1;
    else return (fib(n - 1) + fib(n - 2));
    }
    int fibonacci(int n) {
        int f[] = new int[40];
        f[1] = f[2] = 1;
        for(int i=3; i<=n; ++i){
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Num24416 num24416 = new Num24416();
        int answer = num24416.fib(n);
        System.out.println( answer +" " +(n-2));
    }
}
