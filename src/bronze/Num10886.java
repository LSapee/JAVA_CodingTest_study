package bronze;

import java.util.Scanner;

public class Num10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int count =0;
        for(int i=0; i<n; ++i){
            int a = sc.nextInt();
            if(a ==1){
                ++count;
            }

        }
        if(count>n/2){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}
