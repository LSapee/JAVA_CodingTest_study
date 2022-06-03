package silver;

import java.util.Scanner;

public class Num1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum =0;
        int answer =0;
        for(int i=0; i<n; ++i){
            int a =sc.nextInt();
            for(int j =1; j<=a; ++j){
                if(a%j==0){
                    ++sum;
                }
                if(sum>2){
                    break;
                }
            }
            if(sum <= 2 && a != 1){
                ++answer;
                sum =0;
            }else{
                sum =0;
            }
        }
        System.out.println(answer);
    }
}
