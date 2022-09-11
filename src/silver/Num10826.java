package silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Num10826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger f= new BigInteger("0");
        BigInteger k= new BigInteger("1");
        BigInteger o= new BigInteger("1");

        if(n==0){
            System.out.println(0);
        }else if(n==1){
            System.out.println(1);
        }else{
            for(int i=2; i<n;++i){
                f=k;
                k = o.add(k);
                o=f;
            }
            System.out.println(k);
        }
    }
}
