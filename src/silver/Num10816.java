package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb =new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; ++i){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        Arrays.sort(arr);
        int m =Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());

        for(int i=0; i<m; ++i){
            int a= Integer.parseInt(st.nextToken());
            int c = binarySearch(a,arr);
            int d = binarySearch2(a,arr);
            sb.append(c+d).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static int binarySearch(int a,int[] arr){
        int mid =0;
        int left =0;
        int count =0;
        int right = arr.length-1;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid]==a){
                while(mid!=0&&arr[mid-1]==a){
                    --mid;
                    count++;
                }
                return count;
            }else if(arr[mid]>a){
                right = mid-1;
            }else if(arr[mid]<a){
                left = mid+1;
            }
        }
        return count;
    }
    static int binarySearch2(int a,int[] arr){
        int mid =0;
        int left =0;
        int count =0;
        int right = arr.length-1;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid]==a){
                count =1;
                while(mid<arr.length-1&&arr[mid+1]==a){
                    count++;
                    mid++;
                }
                return count;
            }else if(arr[mid]>a){
                right = mid-1;
            }else if(arr[mid]<a){
                left = mid+1;
            }
        }
        return count;
    }
}
