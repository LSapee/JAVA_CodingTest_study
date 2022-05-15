package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {1,2,10,11,12,18};
        ArrayList<Integer> al = new ArrayList<>();
        int sum =0;
        for(int i=0; i<a.length;i++){
            if(i==a.length-1){
                if(sum!=0 &&a[i]-1 != a[i-1]){
                    sum+=a[i];
                    al.add(sum);
                }else{
                    al.add(a[i]);
                }
            }else{
                if(a[i]+1 == a[i+1]){
                    sum+=a[i];
                }else if(sum!=0&&a[i]+1 != a[i+1]){
                    sum+=a[i];
                    al.add(sum);
                    sum=0;
                }else{
                    al.add(a[i]);
                }
            }

        }
        System.out.println(al);

    }
}