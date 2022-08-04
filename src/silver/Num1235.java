package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1235 {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n =sc.nextInt();
        String s[] = new String[n];
        String ss[] = new String[n];
        int count = 0;
        int end =0;
        for(int i=0; i<n; ++i){
            String num = sc.next();
            s[i] = num;
        }
        while(count>=0){
            int k =count;
            for(int i=0; i<n; ++i){
                String num = s[i];
                end = num.length()-1;
                num = num.substring(end-count,end+1);
                ss[i] = num;
            }
            Arrays.sort(ss);
            for(int i=0; i<n-1; ++i){
                if(ss[i].equals(ss[i+1])){
                    ++count;
                    break;
                }
            }
            if(k==count){
                break;
            }
        }
        System.out.println(count+1);
    }
}
