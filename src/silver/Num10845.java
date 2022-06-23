package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();
        String line =sc.nextLine();
        String s[] = new String[2];
        for(int i=0; i<n; ++i){
            line = sc.nextLine();
            s = line.split(" ");
            if(s[0].equals("push")){
                int c = Integer.parseInt(s[1]);
                queue.add(c);
            }else if(s[0].equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    int t = queue.peek();
                    queue.remove();
                    System.out.println(t);
                }
            }else if(s[0].equals("size")){
                System.out.println(queue.size());
            }else if(s[0].equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(s[0].equals("front")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.peek());
                }
            }else if(s[0].equals("back")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.element());
                }
            }
        }
    }
}
