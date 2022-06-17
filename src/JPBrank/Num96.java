package JPBrank;

import java.util.Arrays;
import java.util.Scanner;

public class Num96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String bom[][] = new String[n][m];

        for(int i =0; i<n; ++i){
            String a = sc.next();
            bom[i] = a.split("");
            }
        for(int i=0; i<n; ++i){
            for(int j =0; j<m; ++j){
                if(bom[i][j].equals("#")){
                    int k =0;
                    int l =0;
                    while(k<m){
                        if(!bom[i][k].equals("#"))
                        bom[i][k] = "0";
                        k++;
                    }
                    while(l<n){
                        if(!bom[l][j].equals("#"))
                            bom[l][j] = "0";
                        l++;
                    }
                }
            }
        }
        int sum =0;
        for(int i=0; i<n;++i){
            for(int j =0; j<m; ++j)
                if(bom[i][j].equals("#")){
                    ++sum;
                }else if(bom[i][j].equals("0")){
                    ++sum;
                }
        }
        System.out.println(sum);

    }
}
