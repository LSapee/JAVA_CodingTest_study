package bronze;

import java.util.Scanner;

public class Num10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int count =0;
            String s1 =sc.next();
            String s2 =sc.next();
            String s3 =sc.next();
            String s4 =sc.next();
            String s5 =sc.next();
            String ss1[] = s1.split("");
            String ss2[] = s2.split("");
            String ss3[] = s3.split("");
            String ss4[] = s4.split("");
            String ss5[] = s5.split("");
            int max = Math.max(ss1.length,ss2.length);
            max=Math.max(max,ss3.length);
            max=Math.max(max, ss4.length);
            max=Math.max(max, ss5.length);

            StringBuilder sb = new StringBuilder();

            while(count<max){
                if(count<ss1.length){
                    sb.append(ss1[count]);
                } if(count<ss2.length){
                    sb.append(ss2[count]);
                } if(count<ss3.length){
                    sb.append(ss3[count]);
                } if(count<ss4.length){
                    sb.append(ss4[count]);
                } if(count<ss5.length){
                    sb.append(ss5[count]);
                }
                ++count;
            }
        System.out.println(sb);
    }
}
