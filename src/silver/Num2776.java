package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());
        for(int i=0; i<t; ++i){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int arr[] = new int[n];
            for(int j=0; j<n;++j){
                int a = Integer.parseInt(st.nextToken());
                arr[j] = a;
            }
            Arrays.sort(arr);
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int count =0;
            for(int j=0; j<m; ++j){
                int num = Integer.parseInt(st.nextToken());
                int left =0;
                int right = n-1;
                int mid;
                while(left<=right){
                    mid = (left+right)/2;
                    if(arr[mid]==num){
                        count++;
                        break;
                    }else if(arr[mid]<num){
                        left = mid+1;
                    }else if(arr[mid]>num){
                        right = mid-1;
                    }
                }
                if(count>0){
                    sb.append("1\n");
                    count=0;
                }else{
                    sb.append("0\n");
                }
            }
        }
        System.out.println(sb);

    }
}
