package bronze;

import java.util.Scanner;

public class Num2747 {
    int[] PI(int num[]){
        int p[] = new int[2];
        p[0] = num[1];
        p[1] = num[0]+num[1];
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Num2747 pi = new Num2747();
        int n = sc.nextInt();
        int num[] = new int[2];
        num[0] =0;
        num[1] =1;
        if(n==0){
            num[1]=0;
        }else if(n==1){
            num[1]=1;
        }else{
            for(int i=1; i<n; ++i){
                num = pi.PI(num);
            }
        }
        System.out.println(num[1]);
    }

}
