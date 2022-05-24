package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();

        int carrot[] = new int[N];
        int big =0;
        for(int i=0; i<N; ++i){
            int mass = sc.nextInt();
            int suger = sc.nextInt();
            if(suger>=S-P&&S+P>=suger){
                carrot[i] = mass;
            }
        }
        for(int i =0; i<N; ++i){
            big = Math.max(big,carrot[i]);
        }
        for(int i=0; i<N; ++i){
            if(carrot[i]==big&& big!=0){
                big = i+1;
            }
        }
        if(big>0){
            System.out.println(big);
        }else{
            System.out.println("not found");
        }


    }
}