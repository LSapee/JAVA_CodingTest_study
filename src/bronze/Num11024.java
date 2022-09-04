package bronze;

import java.util.Scanner;

public class Num11024 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        String s = sc.nextLine();
        for(int i=0; i<n; ++i){
            s = sc.nextLine();
            String[] s1 = s.split(" ");
            for(int j=0; j<s1.length; ++j){
                int a = Integer.parseInt(s1[j]);
                sum += a;
            }
            System.out.println(sum);
            sum =0;
        }


    }
}
