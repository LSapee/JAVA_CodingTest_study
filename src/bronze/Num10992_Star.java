package bronze;

import java.util.Scanner;

public class Num10992_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; ++i){
            for(int j=0; j<n-i; ++j){
                sb.append(" ");
            }
            for(int j=0; j<i*2-1; ++j){
                if(i==n){
                    sb.append("*");
                }else if(j>0&&j<i*2-2){
                    sb.append(" ");
                }else{
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
