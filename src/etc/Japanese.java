package etc;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Japanese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a[] = new String[n];
        int b[] = new int[n];
        String aa = "";
        int c =0;
        Map<Integer,String> treeMap = new TreeMap<>();
        for(int i =0; i<n; i++){
            a[i] = sc.next();
            aa = a[i].replaceAll("[a-zA-Z]","");
            c = Integer.parseInt(aa);
            b[i] = c;
            treeMap.put(c,a[i]);
        }
        Arrays.sort(b);
        for(int i =0; i<n; i++){
            System.out.println(treeMap.get(b[i]));
        }


    }
}
