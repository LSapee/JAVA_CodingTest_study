package level02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackQ {
    boolean solution(String s){
        boolean answer = false;

        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        String ss[] = s.split("");
        String st ="";
        for(int i=0; i<ss.length; ++i){
            stack.push(ss[i]);
        }

        while(!stack.empty()){
            st = stack.pop();
            if(!stack.empty()||!stack2.empty()){
                if(st.equals(")")){
                    if(stack.peek().equals("(")){
                        stack.pop();
                    }else{
                        stack2.push(st);
                    }
                }else{
                    stack.push(st);
                    if(!stack2.empty()){
                        while(!stack2.empty()){
                            st = stack2.pop();
                            stack.push(st);
                        }
                    }else{
                        break;
                    }
                }
            }

        }
        System.out.println(stack);
        if(stack.empty()){
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {

        StackQ st = new StackQ();
        String s ="()()";
        String s2 ="(())()";
        String s3 =")()(";
        String s4 ="(()(";
        System.out.println(st.solution(s));
        System.out.println(st.solution(s2));
        System.out.println(st.solution(s3));
        System.out.println(st.solution(s4));
    }
}
