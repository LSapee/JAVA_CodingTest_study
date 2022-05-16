package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        int b =0;
        for(int i =0; i<n; i++){
            int k = sc.nextInt();
            b= k;
            if(k>100000){
                if(b>750000){
                    sum+= 65000;
                }else if(b<=750000){
                    sum += (b-100000)/10;
                }
            }
            if(k>750000){
                if(b>1500000){
                    sum+= 150000;
                }else if(b<=1500000){
                    sum += (b-750000)/5;
                }
            }
            if(k>1500000){
              sum += (k-1500000)/2.5;
            }
        }
        System.out.println(sum);

    }
}