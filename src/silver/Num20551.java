package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num20551 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; ++i){
            int a = Integer.parseInt(bf.readLine());
            arr[i] =a;
        }
        Arrays.sort(arr);

        for(int i=0; i<m; ++i){
            int c = Integer.parseInt(bf.readLine());
            sb.append(binarySearch(c,arr)).append("\n");
        }
        System.out.println(sb);
    }
    static int binarySearch(int a,int arr[]){
        int mid =-1;
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid]==a){
                while(mid> 0 && arr[mid-1]==a){
                    mid--;
                }
                return mid;
            }else if(arr[mid]>a){
                right = mid-1;
            }else if(arr[mid]<a){
                left = mid +1;
            }
        }
        return -1;
    }
}
