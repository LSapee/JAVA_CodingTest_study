package silver;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Num10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.nextLine();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; ++i){
            s = sc.nextLine();
            String ss[] = s.split(" ");
            if(ss[0].equals("push_back")){
                dq.addLast(Integer.parseInt(ss[1]));
            }else if(ss[0].equals("push_front")){
                dq.addFirst(Integer.parseInt(ss[1]));
            }else if(ss[0].equals("front")){
                if (dq.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(dq.peekFirst()).append('\n');
                }
            }else if(ss[0].equals("back")){
                if (dq.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(dq.peekLast()).append('\n');
                }
            }else if(ss[0].equals("size")){
                sb.append(dq.size()).append('\n');
            }else if(ss[0].equals("empty")){
                if(dq.isEmpty()){
                    sb.append(1).append('\n');
                }else{
                    sb.append(0).append('\n');
                }
            }else if(ss[0].equals("pop_back")){
                if(dq.isEmpty()){
                    sb.append(-1).append('\n');
                }else {
                    sb.append(dq.pollLast()).append('\n');
                }
            }else if(ss[0].equals("pop_front")){
                if(dq.isEmpty()){
                    sb.append(-1).append('\n');
                }else {
                    sb.append(dq.pollFirst()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
