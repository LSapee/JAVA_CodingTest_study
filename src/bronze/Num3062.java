package bronze;

import java.util.Scanner;

public class Num3062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String k = "";
        int m =1;
        for(int i=0; i<n; ++i){
            String s =sc.next();
            String ss[]= s.split("");
            for(int j= ss.length-1;j>=0;--j){
                k = k+ss[j];
            }
            int a= Integer.parseInt(s);
            int b= Integer.parseInt(k);
            a = a+b;
            k=""+a;
            String kk[] = k.split("");
            for(int j=0; j<kk.length/2; ++j){
                if(!kk[j].equals(kk[kk.length-m])){
                    k="NO";
                    break;
                }
                ++m;
                k="YES";
            }
            System.out.println(k);
            k="";
            m=1;
        }
    }
}
