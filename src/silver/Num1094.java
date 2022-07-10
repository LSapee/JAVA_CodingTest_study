package silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Num1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bar = 64;
        int n = sc.nextInt();
        int count =0;
        int a =n;
        ArrayList<Integer> al = new ArrayList<>();
        while(bar>=1){
            al.add(bar);
            bar = bar/2;
        }
        System.out.println(al);
        for(int i=0; i<al.size(); ++i){
            if(al.get(i)==n){
                count =1;
                break;
            }else if(al.get(i)<=a){
                a = a-al.get(i);
                ++count;
            }
        }
        System.out.println(count);
    }
}
