package etc;

import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        String a ="";

        for(int i =s*(p-1) +1;i<=n; ++i){
            a = a + i+" ";
            if(i>=s){
                break;
            }
        }
        a= a.trim();
        if(a.length()==0){
            System.out.println("none");
        }else{
            System.out.println(a);
        }
    }
}