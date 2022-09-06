package bronze;

import java.util.Scanner;

public class Num2755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        String s = sc.nextLine();
        double sum = 0.0;
        double sum1 = 0.0;
        double a =0.0;
        for(int i=0; i<n; ++i){
            s = sc.nextLine();
            String ss[] = s.split(" ");
            int b = Integer.parseInt(ss[1]);
            if(ss[2].equals("A+")){
               a= 4.3;
            }else if(ss[2].equals("A0")){
                a= 4.0;
            }else if(ss[2].equals("A-")){
                a= 3.7;
            }else if(ss[2].equals("B+")){
                a= 3.3;
            }else if(ss[2].equals("B0")){
                a= 3.0;
            }else if(ss[2].equals("B-")){
                a= 2.7;
            }else if(ss[2].equals("C+")){
                a= 2.3;
            }else if(ss[2].equals("C0")){
                a= 2.0;
            }else if(ss[2].equals("C-")){
                a= 1.7;
            }else if(ss[2].equals("D+")){
                a= 1.3;
            }else if(ss[2].equals("D0")){
                a= 1.0;
            }else if(ss[2].equals("D-")){
                a= 0.7;
            }else if(ss[2].equals("F")){
                a = 0.0;
            }
            sum+=b;
            sum1+= a*b;
        }
        sum = sum1/sum;
        System.out.println(String.format("%.2f",sum));
    }
}
