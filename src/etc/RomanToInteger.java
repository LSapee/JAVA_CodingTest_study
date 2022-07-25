package etc;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ss[] = s.split("");
        int sum =0;
        int a[] = new int[ss.length];

        for(int i= 0; i<ss.length;++i){
            if(ss[i].equals("I")){
                a[i] = 1;
            }else if(ss[i].equals("V")){
                a[i] = 5;
            }else if(ss[i].equals("X")){
                a[i] = 10;
            }else if(ss[i].equals("L")){
                a[i] = 50;
            }else if(ss[i].equals("C")){
                a[i] = 100;
            }else if(ss[i].equals("D")){
                a[i] = 500;
            }else if(ss[i].equals("M")){
                a[i] = 1000;
            }
        }
        for(int i=0; i<a.length;++i){
            if(i<=a.length-2){
                if(a[i]<a[i+1]){
                    sum = sum+(a[i+1]-a[i]);
                    break;
                }else{
                    sum+=(a[i]);
                    sum+=(a[i+1]);
                    break;
                }
            }
            if(a[i]<a[i+1]){
                sum = sum+(a[i+1]-a[i]);
                ++i;
            }else{
                sum = sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
//DCXXI