package etc;

import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int sumtimes[] = new int[n];
        int time = m*60 +s;
        int sumtime = 0;
        int sum=0;
        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sumtime = a*60 +b;
            sumtimes[i] = sumtime;
        }
        Arrays.sort(sumtimes);
        for(int i =0; i<sumtimes.length; i++){
            if(time>=sumtimes[i]){
                time=time-sumtimes[i];
                sum++;
            }
        }
        System.out.println(sum);
    }
}