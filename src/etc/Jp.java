package etc;

import java.util.Scanner;

public class Jp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int stday[] = new int[n];
        int endday[] = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++) {
            stday[i] = sc.nextInt();
            endday[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            if(stday[i]<=stday[i+1] && endday[i] <=endday[i+1]){
                sum++;
            }else if(stday[i]>=stday[i+1] && endday[i] >=endday[i+1]){
                sum++;
            }
        }
        if(sum==n-1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}
