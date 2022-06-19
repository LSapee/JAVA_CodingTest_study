package JPCrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Num81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s[] = new String[n];
        String ss= sc.nextLine();
        int answer =0;
        for(int i=0; i<n; ++i){
            s[i] = sc.nextLine();;
        }
        ArrayList<String> al = new ArrayList<>(Arrays.asList(s));

        for(int i=0; i<al.size();++i){
            String aa[] = al.get(i).split(" ");
            for(int j =i+1; j<al.size(); ++j){
                String bb[] = al.get(j).split(" ");
                if(aa[0].equals(bb[0])){
                    if(!aa[1].equals(bb[1])){
                        ++answer;
                       if(i>j){
                           al.remove(i);
                           al.remove(j-1);
                       }else{
                           al.remove(j);
                           al.remove(i);
                       }
                       i=-1;
                        break;
                    }
                }
            }

        }
        System.out.println(answer);
    }
}
