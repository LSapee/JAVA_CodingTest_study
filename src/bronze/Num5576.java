package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num5576 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        int arr2[] = new int[10];

        for(int i =0; i<10; ++i){
            arr[i] = Integer.parseInt(bf.readLine());
        }for(int i =0; i<10; ++i){
            arr2[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println((arr[9]+arr[8]+arr[7]) +" "+(arr2[9]+arr2[8]+arr2[7]));
    }
}
