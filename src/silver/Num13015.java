package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num13015 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int a =n*2-3;
        int h =n*2-1;
        int count =0;
        for(int i=0; i<h; ++i){
            if(i<h/2){
                for(int j=0; j<i; ++j){
                    sb.append(" ");
                }
            }else{
                for(int j=i-h/2; j<h/2; ++j){
                    sb.append(" ");
                }

            }
            if(i==h/2){
                for(int j=0;j<n-1; ++j){
                    if(j>0){
                        sb.append(" ");
                    }else{
                        sb.append("*");
                    }
                }
            }else{
                for(int j=0;j<n; ++j){
                    if(i>0&&i<h-1){
                        if(j>0 && j<n-1){
                            sb.append(" ");
                        }else{
                            sb.append("*");
                        }
                    }else{
                        sb.append("*");
                    }
                }
            }

            for(int k=0; k<a-count; ++k){
                sb.append(" ");
            }
            for(int j=0; j<n; ++j){
                if(i>0&&i<h-1){
                    if(j>0 && j<n-1){
                        sb.append(" ");
                    }else{
                        sb.append("*");
                    }
                }else{
                    sb.append("*");
                }
            }
            sb.append("\n");
            if(i>=h/2){
                count -= 2;
            }else{
                count += 2;
            }
        }
        System.out.println(sb);
    }
}
