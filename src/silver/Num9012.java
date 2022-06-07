package silver;

import java.util.Scanner;
import java.util.Stack;

public class Num9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<String> st = new Stack<>();
        for (int i = 0; i < n; ++i) {
            String s = sc.next();
            while(s.contains("()")){
                s= s.replaceAll("()","");
            }

        }


    }
}