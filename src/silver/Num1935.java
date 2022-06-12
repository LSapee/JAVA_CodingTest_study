package silver;

import java.util.Scanner;
import java.util.Stack;
//푸는중
public class Num1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String s = sc.next();
        char[] AS = s.toCharArray();
        Stack<Double> st = new Stack<>();
        String and = "";
        double f =0;
        double e = 0;
        for(int i=0; i<s.length(); ++i){
            double aa = AS[i];
            if(aa>=65 &&aa<=90){
                aa = aa-64;
                st.push(aa);
            }else if(aa==42){//*
                f= st.peek();
                st.pop();
                e = st.peek();
                st.pop();
                st.push(e*f);
            }else if(aa==43){//+
                f= st.peek();
                st.pop();
                e = st.peek();
                st.pop();
                st.push(e+f);
            }else if(aa==45){//-
                f= st.peek();
                st.pop();
                e = st.peek();
                st.pop();
                st.push(e-f);
            }else if(aa==47){// /
                f= st.peek();
                st.pop();
                e = st.peek();
                st.pop();
                st.push(e/f);
            }
        }
        double answer = st.peek();
        st.pop();
        System.out.println(String.format("%.3f", answer));
    }
}