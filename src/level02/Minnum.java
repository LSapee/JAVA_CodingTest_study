package level02;

import java.util.ArrayList;
import java.util.Arrays;

public class Minnum {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int c = A.length-1;
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<Integer> AA = new ArrayList<>();
        ArrayList<Integer> BB = new ArrayList<>();
        int min = 0;
        for(int k : A){
            AA.add(k);
        }
        for(int k : B){
            BB.add(k);
        }

        for(int i =0; i<=AA.size()-1; i++){
            c = AA.size()-1;
            min = Math.min(AA.get(i),BB.get(i));
            if(min == AA.get(i)){
                answer += AA.get(i) * BB.get(c-i);
                AA.remove(i);
                BB.remove(c-i);
            }else if(min == BB.get(i)){
                answer += BB.get(i) * AA.get(c-i);
                BB.remove(i);
                AA.remove(c-i);
            }
            i--;

        }

        return answer;
    }
    public static void main(String[] args) {
        int [] a = {0,1,2,3,4};
        int [] b = {0,2,2,2,4};

        Minnum mn = new Minnum();

        System.out.println(mn.solution(a,b));


    }
}
