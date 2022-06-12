package etc;

import java.util.Arrays;

public class M4 {
    static String grid[] ={"..FF","###F","###."};
    static String fire = "F";
    static int sum =0;
    public static boolean travel(int x, int y){
        int h = grid.length;
        int w = grid[0].length();
        String ff[][] = new String[h][w];
        for(int i=0;i<h;++i){
            String s[] = grid[i].split("");
            for(int j=0; j<w; ++j){
                ff[i][j] = s[j];
            }
        }

        if(x<0||y<0||x>=w||y>=h){
            return false;
        }else if(ff[x][y].equals(fire) || ff[x][y].equals("X")){
            return false;
        }else if(x==w-1&&y==h-1){
            ++sum;
            return true;
        }else{
            ff[x][y] = "@";
            if(travel(x-1,y) ||travel(x,y+1)||travel(x+1,y)||travel(x,y-1)){
                ++sum;
                return true;
            }
            ff[x][y] = "X";
            return false;
        }
    }


    public static void main(String[] args) {
        travel(0,0);
        System.out.println(sum);

    }
}
