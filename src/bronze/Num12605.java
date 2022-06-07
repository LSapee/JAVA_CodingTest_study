package bronze;

import java.util.Scanner;

public class Num12605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.nextLine();
        String ss = " ";
        for(int i =0; i<n; ++i){
            s = sc.nextLine();
            if(s.contains(" ")){
                String k[] = s.split(" ");
                for(int j =k.length-1; j>=0; --j ){
                    ss =ss+" "+ k[j];
                }
            }else{
                ss = s;
            }
            ss= ss.trim();
            System.out.println("Case #"+(i+1)+": "+ ss);
            ss="";
        }

    }
}
