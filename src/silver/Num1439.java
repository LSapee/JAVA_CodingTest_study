package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1439 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.next();
        String sss= s;
        String ss = s;
        int min =0;
        s = s.replaceAll("1"," ");
        ss = ss.replaceAll("0"," ");
        while(s.contains("  ")){
            s= s.replaceAll("  "," ");
        }
        while(ss.contains("  ")){
            ss= ss.replaceAll("  "," ");
        }

        String sn[] =s.trim().split(" ");
        String ssn[] =ss.trim().split(" ");

        if(sss.contains("0")&&sss.contains("1")){
            min = Math.min(sn.length,ssn.length);
            System.out.println(min);
        }else{
            System.out.println(0);
        }

    }
}
