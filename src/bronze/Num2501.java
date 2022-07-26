package bronze;

import java.util.Scanner;

public class Num2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = sc.nextInt();
        int answer =0;
        for(int i=1; i<=num; ++i){
            if(num%i==0){
                --count;
            }
            if(count == 0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

}
