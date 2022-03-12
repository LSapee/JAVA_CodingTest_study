package bronze;

import java.util.Scanner;

public class Num10250 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int p = sc.nextInt();
            int f= p%h;
            int k = p/h;
            if(p%h!=0){
                k++;
            }else if(p%h ==0){
                f = h;
            }
            String l ="";
            if(k<10){
                l = f+"0"+k;
            }else{
                l = f+""+k;
            }
            System.out.println(Integer.parseInt(l));
        }
    }
}
