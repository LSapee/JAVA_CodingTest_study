package bronze;

import java.util.Scanner;

public class Num2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f =0;
        long o =1;
        long k =1;

        if(n==0){
            System.out.println(0);
        }else if(n==1){
            System.out.println(1);
        }else{
            for(int i=2; i<n;++i){
                f=k;
                k = o +k;
                o=f;
            }
            System.out.println(k);
        }
    }
}
