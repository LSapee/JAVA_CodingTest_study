package bronze;

import java.util.Scanner;

public class Num11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s1[] = s.split("");
        StringBuilder ss = new StringBuilder();
        for(int i=0; i<s1.length; ++i){
            if(i!=0&& i%10==0){
                ss.append("\n");
            }
            ss.append(s1[i]);
        }
        System.out.println(ss);
    }
}
