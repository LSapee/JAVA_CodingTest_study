package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1235 {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n =sc.nextInt();
        String s[] = new String[n];
        int count = 0;
        int end =0;
        while(count>=0){
            int k =count;
            for(int i=0; i<n; ++i){
                String num = sc.next();
                end = num.length()-1;
                num = num.substring(end-count,end+1);
                s[i] = num;
            }
            Arrays.sort(s);
            System.out.println(Arrays.toString(s));
            System.out.println(count);
            for(int i=0; i<n-1; ++i){
                if(s[i].equals(s[i+1])){
                    ++count;
                    break;
                }
            }
            System.out.println(count);
            System.out.println(k);
            if(k==count){
                break;
            }
        }
        System.out.println(Arrays.toString(s));
        System.out.println(count);
    }
}
