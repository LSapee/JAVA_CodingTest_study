package JPCrank;

import java.util.Scanner;

public class C114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String sn = "";
        String fn ="";
        int c =0;
        for(int i=0; i<n; ++i){
            String s= sc.next();
            fn =s.substring(0,1);
            if(i==0){
                sn = s.substring(s.length()-1,s.length());
            }else{
                if(fn.equals(sn)){
                    sn =s.substring(s.length()-1,s.length());
                }else{
                    ++c;
                    break;
                }
            }
        }
        if(c>0){
            System.out.println(sn+" "+fn);
        }else{
            System.out.println("Yes");
        }
    }
}
