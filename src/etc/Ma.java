package etc;

import java.util.Arrays;

public class Ma {
    public static void main(String[] args) {
        int p[] = {2,5,3,1,4};
        int result[] = new int[p.length];
        int min =p.length;
        int num =0;
        for(int i=0; i<p.length; ++i){
            for(int j =i; j<p.length; j++){
                min = Math.min(min,p[j]);
                if(min==p[j]){
                    num = j;
                }
            }
            if(p[i]!=min){
                int a = p[i];
                p[i] = min;
                p[num] = a;
                ++result[i];
                ++result[num];
            }
            min = p.length;
        }
        System.out.println(Arrays.toString(result));
    }
}
