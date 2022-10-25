package bronze;

import java.util.Scanner;

public class Num18301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int n = (a+1)*(b+1)/(c+1);
        System.out.println(n-1);
    }
}
