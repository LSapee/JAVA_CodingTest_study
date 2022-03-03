package level02;

import java.util.Arrays;

public class MaxnumMinnum {
    public String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");
        int [] k = new int[num.length];
        for(int i = 0; i<num.length; i++){
            k[i] = Integer.parseInt(num[i]);
        }

        Arrays.sort(k);

        answer = k[0]+" "+k[k.length-1];

        return answer;
    }
    public static void main(String[] args) {
        String s = "1 2 3 4";
        MaxnumMinnum mm = new MaxnumMinnum();
        String a = mm.solution(s);
        System.out.println(a);
    }
}
