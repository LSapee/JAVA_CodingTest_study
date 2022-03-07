package bronze;

import java.util.Scanner;

public class Num1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        for(int i =0; i<testcase; i++){
            int a = sc.nextInt();
            if(a%10 !=0 && a>10){
                a = a%10;
            }else if(a%10 ==0){
                a= 10;
            }
            int b = sc.nextInt();

            int c = b%4;
            if(a==1 || a==5|| a==6 || a==10) {
                System.out.println(a);
            }else if(c==0){
                System.out.println(a*a*a*a%10);
            }else if(c==1){
                System.out.println(a%10);
            }else if(c==2){
                System.out.println(a*a%10);
            }else if(c==3){
                System.out.println(a*a*a%10);
            }
        }

    }

}
