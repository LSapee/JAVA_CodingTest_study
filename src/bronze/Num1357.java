package bronze;

import java.util.Scanner;

public class Num1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        String sn ="";
        for(int i=0; i<2; ++i){
            String s = sc.next();
            String ss[] = s.split("");
            for(int j =0; j<ss.length; ++j){
                sn = ss[j]+sn;
            }
            sum += Integer.parseInt(sn);
            sn="";
        }
        sn = sum+sn;
        String ss[] = sn.split("");
        sn ="";
        for(int i=ss.length-1; i>=0; --i){
            sn = sn+ ss[i];
        }
        System.out.println(Integer.parseInt(sn));
    }
}
