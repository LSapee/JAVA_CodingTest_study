package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num14920 {

    static long threenum(long a ,long count){

        if(a==1){
            count++;
            return count;
        }else if(a%2==0){
            return threenum(a/2,++count);
        }else {
            return threenum((a*3)+1,++count);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(bf.readLine());
        long count =0;
        System.out.println(threenum(a,count));
    }
}
