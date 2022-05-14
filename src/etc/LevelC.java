package etc;

import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k[] = new int[n];
        int a = 0;
        for(int i=0; i<n; i++){
            k[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){
            if(k[i]==m){
                a=i+1;
                break;
            }
        }
        if(a==0){
            System.out.println("unlucky");
        }else if(a!=0){
            System.out.println(a);
        }
    }
}