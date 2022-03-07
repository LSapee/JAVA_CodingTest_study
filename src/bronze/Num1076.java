package bronze;

import java.util.Scanner;

public class Num1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color ={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

        String first = sc.next();
        String second =sc.next();
        String third = sc.next();
        for(int i =0; i<color.length;i++){
            if(first.equals(color[i])){
                first = i+"";
            }
            if(second.equals(color[i])){
                second = i+"";
            }
            if(third.equals("black")){
                third = 1+"";
            }else if(third.equals(color[i])){
                third =(int)(Math.pow(10,i)) + "";
            }
        }
        int answer = Integer.parseInt(first+second);
        long k = Long.valueOf(third);
        System.out.println(k*answer);



    }
}
