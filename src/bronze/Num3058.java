package bronze;

import java.util.Scanner;

public class Num3058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        int num =0;
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=7*n; ++i){
            num = sc.nextInt();
            if(num%2==0){
                sum+=num;
                min = Math.min(min,num);
            }
            if(i%7==0){
                System.out.println(sum +" "+ min);
                sum =0;
                min = Integer.MAX_VALUE;
            }
        }


    }
}
