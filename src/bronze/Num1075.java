package bronze;

import java.util.Scanner;

public class Num1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt()/100*100;
        int b = sc.nextInt();
        int c = a/b;
        int i = c;
        String num ="";
        while(a>c){
            c = b*i;
            i++;
        }
        num = num+ c;
        String nums[] =num.split("");
        System.out.println(c);
        System.out.println(i);
        System.out.println(nums[nums.length-2]+nums[nums.length-1]);

    }
}
