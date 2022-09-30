package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int limit = sc.nextInt();
        int[] grade = new int[n];
        for(int i=0; i<n;++i){
            grade[i] =sc.nextInt();
        }
        Arrays.sort(grade);
        System.out.println(grade[n-limit]);
    }
}
