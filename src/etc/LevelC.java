package etc;

import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int k = sc.nextInt();
       int k1[] = new int[n];
       int k2[] = new int[n];
       int min = 100000;
       for(int i =0; i<n; i++){
           int time = sc.nextInt();
           k1[i] =time;
       }
       Arrays.sort(k1);
       for(int i =0; i<n; i++){
           k2[i] = Math.abs(k1[i]-k);
           min = Math.min(min,k2[i]);
       }

        for(int i =0; i<n; i++){
           if(k2[i]==min){
               System.out.println(k1[i]);
           }
       }

    }
}