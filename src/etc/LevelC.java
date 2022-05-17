package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int m = sc.nextInt();

       for(int i=0; i<m; i++){
           int k = sc.nextInt();
           int p = k/n;
           int q = p+1;
           if(k<n){
               System.out.println(n);
           }else if(k-p*n <q*n-k){
               System.out.println(p*n);
           }else if(k-p*n == q*n-k){
               System.out.println(q*n);
           }else if(k-p*n >q*n-k){
               System.out.println(q*n);
           }
       }
    }
}