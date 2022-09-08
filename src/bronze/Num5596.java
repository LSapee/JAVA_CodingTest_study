package bronze;

import java.util.Scanner;

public class Num5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= 0;
        int b = 0;
        for(int i=0;i<4; ++i){
            int c = sc.nextInt();
            a+=c;
        }
        for(int i=0;i<4; ++i){
            int c = sc.nextInt();
           b+=c;
        }
        System.out.println(Math.max(a,b));
    }
}
