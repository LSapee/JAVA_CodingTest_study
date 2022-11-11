package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int arr[] = new int[m];
        int count =1;
        String s ="";
        for(int i=1; i<=m; ++i){
            int a = n*i;
            while(a>0){
                s = s+ a%10 ;
                a= a/10;
                count *=10;
            }
            arr[i-1] = Integer.parseInt(s);
            s = "";
            count =1;
        }
        Arrays.sort(arr);
        System.out.println(arr[m-1]);
    }
}
