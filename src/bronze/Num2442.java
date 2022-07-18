package bronze;

import java.util.Scanner;

public class Num2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        StringBuilder s = new StringBuilder();
        for(int i=1; i<=n; ++i){
            for(int j=0; j<n-i; ++j){
                s.append(" ");
            }
            for(int j=0; j<=(i-1)*2; ++j){
                s.append("*");
            }
            s.append("\n");
        }
        System.out.println(s);
    }
}
