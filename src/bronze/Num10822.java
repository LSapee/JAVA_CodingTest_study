package bronze;

import java.util.Scanner;

public class Num10822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String n[] = a.split(",");
        int sum =0;
        for(int i=0; i<n.length; ++i){
            int num = Integer.parseInt(n[i]);
            sum+=num;
        }
        System.out.println(sum);
    }
}
