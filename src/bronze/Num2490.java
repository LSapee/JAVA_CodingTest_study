package bronze;

import java.util.Scanner;

public class Num2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = 0;

        for(int i=0; i<3; ++i){
            for(int j =0; j<4; ++j){
                int a = sc.nextInt();
                f+=a;
            }
            if(f==4){
                System.out.println("E");
            }else if(f==3){
                System.out.println("A");
            }else if(f==2){
                System.out.println("B");
            }else if(f==1){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
            f=0;
        }
    }
}
