package JPCrank;

import java.util.Scanner;

public class Num36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n[] = new int[4];
        int game[] = new int[4];
        int m[] = new int[2];
        int game2[] = new int[2];

        for(int i=0; i<n.length; ++i){
            n[i] = sc.nextInt();
        }
        for(int i =0; i<game.length; ++i){
            game[i] = sc.nextInt();
        }
        int win1 = Math.min(game[n[0]-1],game[n[1]-1]);
        int win2 = Math.min(game[n[2]-1],game[n[3]-1]);
        int a = 0;
        int b = 0;
        for(int i=0; i<4; ++i){
            if(game[i] == win1){
                System.out.println(i);
                a= i+1;
            }else if(game[i] == win2){
                System.out.println(i);
                b = i+1;
            }
        }
        m[0] = Math.min(a,b);
        m[1] = Math.max(a,b);
        game2[0] = sc.nextInt();
        game2[1] = sc.nextInt();
        int win3 = Math.min(game2[0],game2[1]);
        if(win3==game2[0]){
            System.out.println(m[0]);
            System.out.println(m[1]);
        }else if(win3==game2[1]){
            System.out.println(m[1]);
            System.out.println(m[0]);
        }





    }
}
