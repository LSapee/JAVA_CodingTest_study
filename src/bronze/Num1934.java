package bronze;

import java.util.Scanner;

public class Num1934 {
    public static int a(int o,int p){
        while(p!=0){
            int num  = o%p;

            o=p;
            p=num;
        }
        return o;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q,w,e;
        for(int i=0; i<n;++i){
            q= sc.nextInt();
            w= sc.nextInt();
            e=a(q,w);
            System.out.println(q*w/e);
        }
    }
}
