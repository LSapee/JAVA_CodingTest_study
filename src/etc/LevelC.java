package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String t = sc.nextLine();

       t= t.replaceAll("/"," ");
       t= t.replaceAll(":", " ");
        String a[] =t.split(" ");

        int day= Integer.parseInt(a[1]);
        int m= Integer.parseInt(a[2]);
        if(m>=24){
            int k = m/24;
            m = m%24;
            day = day+k;
        }
        if(m<10){
            System.out.println(a[0]+"/"+day+" 0"+m+":"+a[3]);
        }else{
            System.out.println(a[0]+"/"+day+" "+m+":"+a[3]);
        }

    }
}