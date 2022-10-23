package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10823 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum =0;
        String s = "";
        while((s= bf.readLine())!=null){
            sb.append(s);
        }
        s = sb.toString();
        String ss[] = s.split(",");
        for(int i=0; i<ss.length; ++i){
            int a= Integer.parseInt(ss[i]);
            sum +=a;
        }
        System.out.println(sum);
    }
}
