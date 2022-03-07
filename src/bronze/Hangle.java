package bronze;

import java.util.Scanner;

public class Hangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String han = sc.next();

        char a = han.charAt(0);
        System.out.println(((int)a)-44031);
    }
}
