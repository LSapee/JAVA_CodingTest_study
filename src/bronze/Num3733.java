package bronze;

import java.util.Scanner;

public class Num3733 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(sc.hasNextInt()){
            int a = sc.nextInt()+1;
            int b = sc.nextInt();
            System.out.println(b/a);
        }
    }
}
