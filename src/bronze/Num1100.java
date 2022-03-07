package bronze;

import java.util.Scanner;

public class Num1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        for(int i=0; i<8; i++){
            String[] a = sc.next().split("");
            if(i%2==0){
                for(int j=0; j<8;j=j+2){
                    if(a[j].equals("F")){
                        count++;
                    }
                }
            }else{
                for(int j=1;j<8;j=j+2){
                    if(a[j].equals("F")){
                        count++;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
