package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1003 {

    static Integer[][] zo = new Integer[41][2];
    static Integer[] fibonacci(int n) {

        if(zo[n][0]==null ||zo[n][1]==null){
            zo[n][0]=fibonacci(n-1)[0]+fibonacci(n-2)[0];
            zo[n][1]=fibonacci(n-1)[1]+fibonacci(n-2)[1];
        }

        return zo[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        zo[0][0]=1;
        zo[0][1]=0;
        zo[1][0]=0;
        zo[1][1]=1;
        int a =Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        while(a-->0){
            int n = Integer.parseInt(bf.readLine());
            fibonacci(n);
            sb.append(zo[n][0]+" "+zo[n][1]).append("\n");
        }
        System.out.println(sb);
    }
}
