package bronze;

import java.util.Scanner;

public class Num2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int sum =0;
        for(int i=0;i<n; ++i){
            int a = sc.nextInt();
            if(a==1){
                ++count;
            }else{
                count=0;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}
