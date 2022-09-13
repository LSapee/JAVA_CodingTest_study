package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num10815 {
    static int[] M;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n =sc.nextInt();
        M = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; ++i){
            M[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        Arrays.sort(M);

        for(int i=0; i<k; ++i){
            int a= sc.nextInt();
            int result = BS(a);
            if(result!= -1) {
                sb.append("1 ");
            }else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);

    }
    private static int BS(int target){
        int left =0;
        int right = M.length-1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(M[mid]<target) {
                left = mid + 1;
            }else if(M[mid]>target) {
                right = mid - 1;
            }else{
                return mid;}
        }
        return -1;
    }
}

