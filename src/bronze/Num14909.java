package bronze;

import java.util.Scanner;

public class Num14909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        while(sc.hasNext()){
            int a= sc.nextInt();
            if(a>0){
                ++count;
            }
        }
        System.out.println(count);
    }
}
