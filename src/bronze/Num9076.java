package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num9076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[5];
        for(int i=0; i<n; ++i){
            for(int j=0; j<5; ++j){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            if(a[3]-a[1]>=4){
                System.out.println("KIN");
            }else{
                System.out.println(a[1]+a[2]+a[3]);
            }
        }
    }
}
