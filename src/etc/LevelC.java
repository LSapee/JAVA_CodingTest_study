package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k =0;
        int f[] = new int[n];
        int answer = 0;
        int num =0;
        for(int i=0; i<n; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            k = b+a;
            f[i] =k;
        }
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(f);
        for(int i=0; i<f.length; ++i){
            al.add(f[i]);
        }
        int count[] = new int[n];

        for(int i =0; i<f.length; ++i){
            count[i] = Collections.frequency(al,f[i]);
            System.out.println(count[i]);
        }
        num = count[0];
        for(int i=1; i< count.length; ++i){
            if(num<count[i]){
                num =count[i];
                answer = i+1;
            }
        }
        System.out.println(answer);
    }
}