package etc;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = x+"";
        String ss[] = s.split("");
        String s2="";
        for(int i=0; i<ss.length; ++i){
            s2 = ss[i] +s2;
        }
        if(s.equals(s2)){
            System.out.println("ture");
        }else{
            System.out.println("false");
        }
    }
}
