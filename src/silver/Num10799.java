package silver;

import java.util.Scanner;
import java.util.Stack;

public class Num10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> st = new Stack<>();
        String s = sc.next();
        String ss[] = s.split("");
        int sum =0;
        for(int i=0; i<s.length();++i){
            if(ss[i].equals("(")){
                st.push(ss[i]);
            }else{
                st.pop();
                if(ss[i-1].equals("(")){
                    sum+=st.size();
                }else {
                    ++sum;
                }
            }
        }
        System.out.println(sum);
    }
}
