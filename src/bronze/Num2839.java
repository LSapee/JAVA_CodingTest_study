package bronze;

import java.util.Scanner;

public class Num2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;
        int c = 0;
        int d= 0;
        int e = 0;
        int answer = 0;
        int count =0;

        while(b>0){
            if(b%5!=0){
                b = a%5+(5*c);
                if(b>a){
                    answer=-1;
                    break;
                }
                d = a/5;
                e = b%3;
                if(d==0){
                    e= b%3;
                }
                if(e== 0){
                    e=b/3;
                    answer =d-c+e;
                    break;
                }
            }else{
                answer = b/5;
                break;
            }
            c++;
            count++;
            if(count==9){
                answer=-1;
                break;
            }
        }
        System.out.println(answer);
    }
}
