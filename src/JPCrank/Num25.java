package JPCrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Num25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int time = 0;
        int sum =0;
        int l = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; ++i){
            int t = sc.nextInt();
            int min = sc.nextInt();
            int p = sc.nextInt();
            if(i==0){
                time=t;
                sum = p;
            }else{
                if(time != t){
                    al.add(sum);
                    sum=0;
                    time = t;
                }
                sum+=p;
            }
        }
        al.add(sum);
        sum=0;
        for(int i =0; i<al.size(); ++i){
            l=al.get(i);
            if(l%m==0){
                sum += l/m;
            }else{
                sum += (l/m)+1;
            }
        }
        System.out.println(sum);
    }
}
