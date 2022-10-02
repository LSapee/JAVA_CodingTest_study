package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Num11650 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int [][] arr = new int[n][2];
        for(int i =0; i<n; ++i){
            String s = bf.readLine();
            String[] ss = s.split(" ");
            arr[i][0] = Integer.parseInt(ss[0]);
            arr[i][1] = Integer.parseInt(ss[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });
        for(int i=0; i<n; ++i){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
