package bronze;

import java.util.Scanner;

public class Num11944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = Integer.parseInt(s);
        int m =sc.nextInt();
        StringBuilder sb =new StringBuilder();

        for(int i =0; i<n; ++i){
            sb.append(s);
            if(sb.length()>m){
                break;
            }
        }
        if(sb.length()>m){
            System.out.println(sb.substring(0,m));
        }else{
            System.out.println(sb);
        }
    }
}
