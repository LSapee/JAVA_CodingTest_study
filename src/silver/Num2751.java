package silver;

import java.util.*;

public class Num2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i= 0; i<n; ++i){
            int a= sc.nextInt();
            al.add(a);
        }
        Collections.sort(al);
        for(int k : al){
            sb.append(k).append("\n");
        }
        System.out.println(sb);
    }
}
