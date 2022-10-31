package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num25496 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[m];
        int count =0;
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; ++i){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        Arrays.sort(arr);

        for(int i=0; i<m; ++i){
            if(n<200){
                n+=arr[i];
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
