package bronze;

import java.util.Scanner;

public class Num1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m= sc.nextInt();
        int sum =0;
        int count=1;
        int a[] = new int[1002];
        for(int i=1; i<=1000;++i){
            for(int j=0; j<i;++j){
                if(count==1001)break;
                a[count] = i;
                ++count;
            }
        }
        for(int i=n; i<=m; ++i){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
