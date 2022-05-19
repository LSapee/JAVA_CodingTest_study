package etc;

import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String n = sc.next();
        String s = sc.next();
        String k[] = s.split("");
        int sum =0;
        for(int i=0; i<k.length; i++){
            if(k[i].equals(n)){
                sum++;
            }
        }

        System.out.println(sum);

    }
}