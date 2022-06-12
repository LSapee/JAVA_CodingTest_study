package etc;

import java.util.Scanner;
import java.util.Stack;
public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int k = sc.nextInt();
            if (k != 0) {
                st.push(k);
            } else if (k == 0) {
                st.pop();
            }
        }
        while (!st.empty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
}