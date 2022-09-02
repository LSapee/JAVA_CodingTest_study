package bronze;

import java.util.Scanner;

public class Num10995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if(n==1){
            System.out.println("*");
        }else{
            for(int i=1; i<=n; ++i){
                if(i==1 || i%2!=0){
                    for(int j=0; j<(n*2)-1; ++j){
                        if(j==1||j%2!=0){
                            sb.append(" ");
                        }else{
                            sb.append("*");
                        }
                    }
                }else{
                    for(int j=0; j<(n*2); ++j){
                        if(j==1||j%2!=0){
                            sb.append("*");
                        }else{
                            sb.append(" ");
                        }
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
