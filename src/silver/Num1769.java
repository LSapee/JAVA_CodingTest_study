package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1769 {

    public static String recursion(String s, int c){
        String ss[] = s.split("");
        int k =0;
        for(int i=0; i<ss.length; ++i){
            k += Integer.parseInt(ss[i]);
        }
        if(k<10){
            if(k%3==0){
                return c+"\nYES";
            }else{
                return c+"\nNO";
            }
        }else{
            s = k+"";
            return recursion(s,count(c));
        }
    }
    public static int count(int c){
        return c+1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = bf.readLine();
        int a =1;
        if(s.length()<2){
            a =Integer.parseInt(s);
            if(a%3==0){
                sb.append(0).append("\n").append("YES");
            }else{
                sb.append(0).append("\n").append("NO");
            }
        }else{
            sb.append(recursion(s,a));
        }
        System.out.println(sb);
    }
}
