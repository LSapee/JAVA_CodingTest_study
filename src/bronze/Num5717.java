package bronze;

import java.util.Scanner;

public class Num5717 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();

        while(1>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a =a+b;
            if(a!=0){
                sb.append(a).append("\n");
            }else{
                break;
            }
        }

        System.out.println(sb);

    }
}
