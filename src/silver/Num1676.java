package silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Num1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger bn = new BigInteger("1");
        int count =0;
        String s ="";
        for(int i=1; i<=n; ++i){
            s = i+"";
            BigInteger bn2 = new BigInteger(s);
            bn = bn.multiply(bn2);
        }
        System.out.println(bn);
        s = bn.toString();
        n = s.length();
        String[] sa = s.split("");
        for(int i=n-1; n-1>0; --i){
            if(sa[i].equals("0")){
                ++count;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
