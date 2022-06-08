package silver;

import java.util.Scanner;
import java.util.Stack;

public class Num3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum= 0;
        int answer =0;
        for(int i=0; i<n; ++i){
            String s = sc.next();
            while(s.contains("AA")||s.contains("BB")){
                if(s.contains("AA")){
                    s=s.replaceAll("AA","");
                    ++sum;
                }else if(s.contains("BB")){
                    s=s.replaceAll("BB","");
                    ++sum;
                }
            }
            if(sum>0 && s.length()<1){
                ++answer;
                sum=0;
            }
        }
        System.out.println(answer);
    }
}
/*
* int count = 0;
        Stack<String> st = new Stack<>();
        Stack<String> st2 = new Stack<>();
        for(int i = 0; i<n; ++i){
            String s = sc.next();
            String ss[] = s.split("");
            for(int j =0; j<ss.length; ++j ){
                st.push(ss[i]);
            }
            if(!st.empty()){
                ++count;
                String a= st.peek();
                String b= "";
                st.pop();
                if(st.peek().equals(a)){
                    st.pop();
                }else if(!st.peek().equals(a)){
                    b = st.peek();


                }
            }
        }
* */