package etc;

import com.sun.org.apache.xpath.internal.objects.XBooleanStatic;

import java.util.LinkedList;
import java.util.Queue;

class M55{
    int row , col;
    public M55(int row,int col){
        this.row = row;
        this.col = col;
    }
}

public class M44 {
    static int isV[][];
    static int h, w;
    static String ff[][];

    public static void main(String[] args) {
        String []grid = new String[]{"..FF", "###F", "###."};
        h = grid.length;
        w = grid[0].length();
        ff = new String[h][w];
        for(int i=0;i<h;++i) {
            String s[] = grid[i].split("");
            for (int j = 0; j < w; ++j) {
                ff[i][j] = s[j];
            }
        }
        isV = new int[h][w];
        bfs();
    }
    public static void bfs(){
        Queue<M55> queue = new LinkedList<>();
        queue.add(new M55(1,1));
        int[] xA = {-1,0,1,0};
        int[] yA = {0,1,0,-1};
        isV[1][1] = 1;
        while(!queue.isEmpty()) {
            M55 m55 = queue.poll();
            int row = m55.row;
            int col = m55.col;

            for (int i = 0; i < 4; ++i) {
                int x = row + xA[i];
                int y = row + yA[i];

                if (checkL(x, y)) {
                    queue.add(new M55(x, y));
                    isV[x][y] = isV[row][col] + 1;
                }
            }
        }
        System.out.println(isV[h-1][w-1]);
        }
        public static boolean checkL(int row, int col){
            if(row<1|| row>h-1 || col<1||col>w-1) return false;
            if(isV[row][col]!=0 ||ff[row][col].equals("F")) return false;
            return true;
        }
    }

