package JPCrank;


import java.util.Scanner;

public class Num69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int pm = sc.nextInt();
        int pd = sc.nextInt();
        int sum =0;

        y = (y%4);
        if(y!=0){
            y=y+1;
        }
        y =y*(28*6+13);
        if(pm<m){
            pm = pm+m;
            for(int i =m; i<=pm; ++i){
                if(i%2==0){
                    sum+= 15;
                }else{
                    sum+= 13;
                }
            }
        }else{
            for(int i =m; i<pm; ++i){
                if(i%2==0){
                    sum+= 15;
                }else{
                    sum+= 13;
                }
            }
        }

        sum += pd-d;
        sum += y;

        System.out.println(sum);

    }
}
