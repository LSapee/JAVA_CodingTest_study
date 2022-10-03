package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Num11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        int[][] num = new int[n][2];
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<n; ++i){
            String s = bf.readLine();
            String ss[] = s.split(" ");
            num[i][0] = Integer.parseInt(ss[0]);
            num[i][1] = Integer.parseInt(ss[1]);
        }

        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];

                }else{
                    return o1[1]-o2[1];
                }
            }
        });
        for(int i=0; i<n;++i){
            sb.append(num[i][0]).append(" ").append(num[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
