package bronze;

import java.util.Scanner;

public class Num10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,d;
        a=0;b=0;c=0;d=0;
        while(1>0){
            if(!sc.hasNextLine()){
                break;
            }
            String s = sc.nextLine();
            String ss[] = s.split("");
            for(int i=0; i<ss.length; ++i){
                if(ss[i].matches("[a-z]")){
                    ++a;
                }else if(ss[i].matches("[A-Z]")){
                    ++b;
                }else if(ss[i].matches("[0-9]")){
                    ++c;
                }else{
                    ++d;
                }
            }
            System.out.println(a+" "+b+" "+c+" "+d);
            a=0;
            b=0;
            c=0;
            d=0;
        }
    }
}
