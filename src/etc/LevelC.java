package etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rank[][] = new int[n][3];
        String answer = "";
        for(int i =0; i<n; ++i){
            rank[i][0] = sc.nextInt();
            rank[i][1] = sc.nextInt();
            rank[i][2] = sc.nextInt();
        }

       Arrays.sort(rank, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               if(o1[0] == o2[0]){
                   if(o1[1] ==o2[1]){
                       return o2[2]-o1[2];
                   }
                   return o2[1]-o1[1];
               }else{
                   return o2[0]-o1[0];
               }

           }
       });

        for(int i =0; i<rank.length; ++i){
            for(int j =0; j<3; ++j){
                answer = answer + " "+rank[i][j];
            }
            answer = answer.trim();
            System.out.println(answer);
            answer = "";
        }
    }
}