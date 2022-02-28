package bronze05;

import java.util.Scanner;

public class BeforeParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=5; i++){
            System.out.print(sc.nextInt()-a*b+ " ");
        }
    }
}
