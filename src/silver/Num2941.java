package silver;

import java.util.Scanner;

public class Num2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] croA = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String word = sc.next();

        int count = 0;
        for(int i =0; i<croA.length; i++){
            if(word.contains(croA[i])){
                word = word.replaceFirst(croA[i],"0");
                count++;
                i=-1;
            }
        }
        word = word.replaceAll("0","");
        System.out.println(count+word.length());

    }
}
