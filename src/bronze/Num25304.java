package bronze;

import java.util.Scanner;

public class Num25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int sum =0;
        int count =sc.nextInt();
        for(int i=0; i<count;++i){
            int a= sc.nextInt();
            int b = sc.nextInt();
            a =a*b;
            sum +=a;
        }
        if(n==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
