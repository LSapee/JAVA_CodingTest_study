package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int q = sc.nextInt();
       for(int i=0; i<q; i++){
           int n = sc.nextInt();
            int sum =1;
           for(int j=2; j<n; j++){
               if(n%j==0){
                   sum +=j;
               }
           }
           System.out.println(sum);
            if(n==sum){
                System.out.println("perfect");
            }else if(n-sum==1){
                System.out.println("nearly");
            }else{
                System.out.println("neither");
            }
       }

    }
}
