package etc;

import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int asum = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String s2 = sc.next();
            if (s.equals(s2)) {
                sum = sum + 2;
            } else if (s.length() == s2.length()) {
                String a[] = s.split("");
                String a1[] = s2.split("");
                for (int j = 0; j < a.length; j++) {
                    if (!a[j].equals(a1[j])) {
                        asum = asum + 1;
                    }
                }
                if(asum<=1){
                    sum=sum+1;
                }
                asum=0;
            }
        }
        System.out.println(sum);
    }
    }