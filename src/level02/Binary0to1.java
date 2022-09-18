package level02;

import java.util.Arrays;

public class Binary0to1 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count =0;
        int zcount =0;
        int sl =0;
        int a = 0;
        while(s.length()!=1){
            sl = s.length();
            s = s.replaceAll("0","");
            a = s.length();
            zcount += sl-a;
            s = Integer.toBinaryString(a);
            ++count;
        }
        answer[0] = count;
        answer[1] = zcount;
        return answer;
    }

    public static void main(String[] args) {
        Binary0to1 by = new Binary0to1();

        int[] k = by.solution("1111111");
        System.out.println(k[0]);
        System.out.println(k[1]);
    }
}
