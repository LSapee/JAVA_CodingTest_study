package bronze;

import java.util.Scanner;

public class Num10990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; ++i){
            for(int j=n; j>0;--j){
                if(j==i+1){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            for(int j=0; j<n; ++j){
                if(j+1==i){
                    sb.append("*");
                    break;
                }else if(i==0){
                    break;
                }else{
                    sb.append(" ");
                }
            }
            if(i<n-1){
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
