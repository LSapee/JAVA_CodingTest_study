package etc;

import java.util.Scanner;

public class LevelB {

    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String rope[][] = new String[h][w];

        for(int i = 0; i<h; ++i){
            String k = sc.next();
            String kk[]= k.split("");
            for(int j=0; j<w; ++j){
                rope[i][j] = kk[j];
            }
        }
       int cnt = 0;

        for(int i =0; i<h;++i){
            for(int j=0; j<w;++j){
                if(rope[i][j].equals("#")){
                    for(int d=0; d<4; ++d){
                        int dx = i + dir[d][0];
                        int dy = j + dir[d][1];
                        if(dx < 0 || dx >= h || dy < 0 || dy >= w) {
                            cnt++;
                        }
                        if(dx >= 0 && dx < h && dy >= 0 && dy < w && rope[dx][dy].equals(".")) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
