package level01;

import java.util.Arrays;

public class Minimum_Rectangle {

    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w =0;
        int max_h=0;
        int w=0;
        int h =0;
        for(int i =0; i<sizes.length; i++){
            w=Math.max(sizes[i][0],sizes[i][1]);
            h=Math.min(sizes[i][0],sizes[i][1]);
            max_w = Math.max(max_w,w);
            max_h = Math.max(max_h,h);
        }
        answer = max_w*max_h;

        return answer;
    }
    public static void main(String[] args) {
        int [][] sizes ={{60,50},{30,70},{60,30},{80,40}};

        int answer = 0;
        Minimum_Rectangle mr = new Minimum_Rectangle();

        mr.solution(sizes);

    }
}
