package etc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JaD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k[] = new int[n];
        int k2[] = new int[n];
        int sum = 0;


        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            k[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            if(k[i]+1 == k[i+1]){
                sum +=1;
            }else if(sum>0){
                k2[i] = sum;
                sum =0;
                continue;
            }
            k2[i] = sum;
        }
        System.out.println(Arrays.toString(k));
        System.out.println(Arrays.toString(k2));
    }
}
