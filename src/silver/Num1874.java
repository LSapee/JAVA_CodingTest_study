package silver;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//푸는중
public class Num1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int lan[] = new int[n];
        int k =1;
        for(int i=0; i<n; ++i){
            lan[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(lan));
        for(int i=0; i<n; ++i){
            for(int j =k; j<=n; ++j){
                if(!st.empty()){
                    if(st.peek() == lan[i]){
                        System.out.println("-");
                        st.pop();
                        break;
                    }
                }
                st.push(j);
                System.out.println("+");
                k=j+1;
            }
        }
        if(!st.empty()){

        }
    }
}
