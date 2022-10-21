package bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Num4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(sc.hasNextLine()){
            st = new StringTokenizer(sc.nextLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a>b){
                sb.append("Yes\n");
            }else if(a==0 && b== 0){
                break;
            }else{
                sb.append("No\n");
            }
        }
        System.out.println(sb);
    }
}
