package silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Num1427_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(n>=10){
            int a= n%10;
            al.add(a);
            n = n/10;
        }
        al.add(n);
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int t:al){
            sb.append(t);
        }
        System.out.println(sb);
    }
}
