package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num11719 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s ="";

            while((s= br.readLine())!=null){
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
