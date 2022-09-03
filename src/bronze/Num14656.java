package bronze;

import java.util.Scanner;

public class Num14656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int count =0;

        for(int i=1; i<=n; ++i){
            int a =sc.nextInt();
            if(i!=a){
                ++count;
            }
        }
        System.out.println(count);
    }
}
