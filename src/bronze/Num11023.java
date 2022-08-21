package bronze;

import java.util.Scanner;

public class Num11023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int sum =0;

        for(int i=0;i<ss.length; ++i){
            sum += Integer.parseInt(ss[i]);
        }
        System.out.println(sum);
    }
}
