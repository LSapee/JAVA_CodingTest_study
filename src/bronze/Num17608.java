package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count =1;
        int n =Integer.parseInt(bf.readLine());

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; ++i){
            st.push(Integer.parseInt(bf.readLine()));
        }
        int f = st.pop();
        while(!st.empty()){
            int a =st.pop();
            if(a>f){
                ++count;
                f = a;
            }
        }
        System.out.println(count);
    }
}
