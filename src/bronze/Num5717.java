package bronze;

import java.util.Scanner;

public class Num5717 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();

        while(sc.hasNextLine()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a =a+b;
            if(a!=0){
                sb.append(a).append("\n");
            }
        }

        System.out.println(sb);

    }
}
