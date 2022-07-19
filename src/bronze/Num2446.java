package bronze;

import java.util.Scanner;

public class Num2446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = 0;
        StringBuilder s = new StringBuilder();
        for(int i =n; i>1; --i){
            for(int j=1; j<i*2; ++j){
                s.append("*");
            }
            ++q;
            s.append("\n");
            for(int j=0; j<q; ++j){
                if(i==2){
                    break;
                }
                s.append(" ");
            }
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                s.append(" ");
            }
            for (int j = 0; j <= (i - 1) * 2; ++j) {
                s.append("*");
            }
            s.append("\n");
        }
        System.out.println(s);
    }
}
