package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = sc.next();
        String s = sc.next();
        int sum =0;
        String t1[] = t.split("");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(t1));

        for(int i =al.size()-1; i>=0; i--){
            if(!t.equals(s)){
                t = al.get(i)+t;
                al.remove(i);
                sum++;
                t = t.substring(0,n);
            }
            if(t.equals(s)){
                break;
            }
        }
        System.out.println(sum);


    }
}