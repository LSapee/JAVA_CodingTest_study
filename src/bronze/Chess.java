package bronze;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chess[] = new int[6];
        int chess2[] = {1,1,2,2,2,8};
        for(int i=0; i<6; i++){
            chess[i] = sc.nextInt();
            chess[i] = chess2[i]-chess[i];

            System.out.print(chess[i] + " ");
        }

    }
}
