package etc;

import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int h = sc.nextInt();
       int w = sc.nextInt();
       int x = sc.nextInt();
        int k =0;
       String a = "";
       for(int i =0; i<h; i++){
           a = a+sc.next();
       }
       String a1[] = a.split("");
       for(int i=0; i<a1.length; i++){
           int b = x*(k+1);
           System.out.print(a1[i]);
           if(i==b-1){
               System.out.println();
               k++;
           }
       }


    }
}
