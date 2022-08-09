package bronze;

import java.util.Scanner;

public class Num2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;++i){
            int k = (n-i)*2+1;
            for(int j=0; j<i-1; ++j){
                sb.append(" ");
            }
            for(int j =0; j<k; ++j){
                sb.append("*");
            }
            if(i==n){
                break;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
