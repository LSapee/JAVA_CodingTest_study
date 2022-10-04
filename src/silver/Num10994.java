package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num10994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int a =n+(n-1)*3;
        int count =1;
        String arr[][] = new String[a][a];
        for(int i=0; i<a;++i){
            Arrays.fill(arr[i],"*");
        }
        while(n>1&&count<a/2+1){
            System.out.println(count);
            for(int i=count;i<a-count;++i){
                for(int j=count; j<a-count;++j){
                    if(i==count || i==a-count-1){
                        arr[i][j] =" ";
                    }else if(j==count || j == a-count-1){
                        arr[i][j] =" ";
                    }
                }
            }
            count +=2;
        }
        for(int i=0; i<a; ++i){
            for(int j=0; j<a; ++j){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
