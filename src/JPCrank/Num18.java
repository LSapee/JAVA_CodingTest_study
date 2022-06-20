package JPCrank;

import java.util.Scanner;

public class Num18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s[] = new String[n];
        int an[] = new int[n];
        int sum =0;
        int answer =0;
        for(int i=0; i<n; ++i){
            s[i] = sc.next();
            an[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        String ss[] = new String[m];
        int am[] = new int[m];
        for(int i=0; i<m; ++i){
            ss[i] = sc.next();
            am[i] = sc.nextInt();
        }
        for(int i=0; i<n; ++i){
            for(int j =0; j<m; ++j){
                if(s[i].equals(ss[j])){
                    am[j] = am[j]-an[i];
                    if(am[j]<0){
                        break;
                    }
                    ++sum;
                    break;
                }
            }
            if(i==n-1){
                if(sum==n){
                    i=-1;
                    ++answer;
                }
                sum=0;
            }
        }
        System.out.println(answer);
    }
}
