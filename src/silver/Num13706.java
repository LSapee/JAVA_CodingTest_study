package silver;

import java.util.Scanner;

public class Num13706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int b = n/2;
       while(n>1){
            if(b*b==n){
                break;
            }else if(b*b>n){
                b= b/2;
            }else if(b*b<n){
                b= b+b/2;
            }
        }
        System.out.println(b);
    }
}
