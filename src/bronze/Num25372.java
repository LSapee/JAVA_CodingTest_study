package bronze;

import java.util.Scanner;

public class Num25372 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int n = sc.nextInt();
        for(int i=0; i<n; ++i){
            String s = sc.next();
            if(s.length()>=6 && s.length()<=9){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
    }
}
