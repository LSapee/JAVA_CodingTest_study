package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1920_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  =sc.nextInt();
        int a[] = new int[n];
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length; ++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int m = sc.nextInt();
        for(int i=0; i<m; ++i){
            int k = sc.nextInt();
            int right = a.length-1;
            int left =0;
            int mid = 0;
            while(answer ==0&& left<=right){
                mid = (right+left)/2;
                if(a[mid]==k){
                    answer =1;
                }else if(a[mid]>k){
                    right = mid-1;
                }else if(a[mid]<k){
                    left = mid+1;
                }
            }
            sb.append(answer).append("\n");
            answer =0;
        }
        System.out.println(sb);
    }
}
