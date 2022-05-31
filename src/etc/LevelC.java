package etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt()-1;
        int x = sc.nextInt();
        int answer =x;
        int aa[] = new int[m];
        for(int i =0; i<m; ++i){
            aa[i] = sc.nextInt();
        }

        for(int i=0; i<m; ++i){
            answer = answer-aa[i];

            if(answer<=0 && n>0){
                answer = x;
                --n;
                --i;
                continue;
            }
            if(answer<=0 && n==0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}