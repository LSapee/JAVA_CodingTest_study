package etc;

import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int k =0;
        int sum =0;
        int back =0;

        for(int i = 0; i<m; i++){
            k++;
            int num = sc.nextInt();
            if(k>n){
                k=k-n;
            }
            if(k==num){
                sum++;
            }else {
                back++;
            }
            if(back >y-1){
                break;
            }
        }
        if(back>y-1){
            System.out.println(-1);
        }else{
            System.out.println(sum*1000);
        }
    }
}