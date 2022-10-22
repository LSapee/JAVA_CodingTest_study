package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); ++i){
            char a = s.charAt(i);
            if(a>=97 && a<=122){
                a = (char) (a-32);
            }else if(a>=65 && a<=90){
                a = (char) (a+32);
            }
            sb.append(a);
        }
        System.out.println(sb);
    }
}
