package silver;

import java.util.Scanner;

public class Num1850_GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = 0;
        long min = 0;
        long c =0;
        max = a>b ? a:b;
        min = a<b ? a:b;
        StringBuilder sb =new StringBuilder();
        while(max%min!=0){
            c = max%min;
            max = min;
            min =c;
        }
        for(long i =0; i<min; ++i){
            sb.append("1");
        }
        System.out.println(sb);
    }
}
