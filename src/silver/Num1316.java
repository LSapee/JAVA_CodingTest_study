package silver;

import java.util.Scanner;

public class Num1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int count = n;
        for(int i =0; i<n; i++){
            String word = sc.next();
            String[] words = word.split("");

            loop1:
            for(int j= 0; j<words.length-1; j++){
                for(int k = j+1; k<words.length; k++){
                    if(!words[j].equals(words[j+1]) &&words[j].equals(words[k])){
                        count--;
                        break loop1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
