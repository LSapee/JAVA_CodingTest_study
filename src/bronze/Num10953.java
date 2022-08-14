package bronze;

import java.util.Scanner;

public class Num10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; ++i){
            String s = sc.next();
            String ss[] = s.split(",");
            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            System.out.println(a+b);
        }
    }
}
