package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1003 {


    int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        Num1003 num1003 = new Num1003();
        StringBuilder sb = new StringBuilder();
        int b =0;
        int c =0;
        int d =0;
        for(int i=0; i<n; ++i){
            int a =Integer.parseInt(bf.readLine());
            if(a==0){
                b=1;
                c=0;
            }else if(a==1){
                b=0;
                c=1;
            }else{
                b=1;
                d=1;
                for(int j=2; j<a; ++j){
                    c = b+d;
                    b = d;
                    d = c;
                }
            }
            sb.append(b);
            sb.append(" ");
            sb.append(c);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
