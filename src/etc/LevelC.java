package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int food[] = new int[n];
        int kcal[] = new int[m];
        for(int i=0; i<n; i++){
            food[i] = sc.nextInt();
        }
        for(int i =0; i<m; i++){
            int sum =0;
            for(int j = 0; j<n; j++){
                int a = sc.nextInt();
                float b = (float) food[j]/100;
                sum += (int)(a*b);
            }
            kcal[i] = sum;
            sum =0;
        }
        for(int i =0; i<kcal.length; i++){
            System.out.println(kcal[i]);
        }
    }
}