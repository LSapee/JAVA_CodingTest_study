package bronze;

import java.util.Scanner;

public class Num1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int w[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int month = sc.nextInt();
        int day = sc.nextInt();
        int sum =0;
        if(month!=1) {
            for (int i = 0; i < month-1; ++i) {
                sum += w[i];
            }
        }
        sum += day;
        sum = sum%7;

        System.out.println(s[sum]);
    }
}
