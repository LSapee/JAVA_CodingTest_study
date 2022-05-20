package etc;

import java.util.Arrays;
import java.util.Scanner;

public class LevelC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n[] = new int[26];
       for(int i =0 ; i<26; i++){
           n[i] = sc.nextInt();
       }
       String s = sc.next();
       String k ="";
       String s1[] = s.split("");
       for(int i=0; i<s1.length; i++){
           if(s1[i].equals("a") && n[0]>0){
                k=k+"a";
                n[0]--;
           }else if(s1[i].equals("b")&& n[1]>0){
               k=k+"b";
               n[1]--;
           }else if(s1[i].equals("c")&& n[2]>0){
               k=k+"c";
               n[2]--;
           }else if(s1[i].equals("d")&& n[3]>0){
               k=k+"d";
               n[3]--;
           }else if(s1[i].equals("e")&& n[4]>0){
               k=k+"e";
               n[4]--;
           }else if(s1[i].equals("f")&& n[5]>0){
               k=k+"f";
               n[5]--;
           }else if(s1[i].equals("g")&& n[6]>0){
               k=k+"g";
               n[6]--;
           }else if(s1[i].equals("h")&& n[7]>0){
               k=k+"h";
               n[7]--;
           }else if(s1[i].equals("i")&& n[8]>0){
               k=k+"i";
               n[8]--;
           }else if(s1[i].equals("j")&& n[9]>0){
               k=k+"j";
               n[9]--;
           }else if(s1[i].equals("k")&& n[10]>0){
               k=k+"k";
               n[10]--;
           }else if(s1[i].equals("l")&& n[11]>0){
               k=k+"l";
               n[11]--;
           }else if(s1[i].equals("m")&& n[12]>0){
               k=k+"m";
               n[12]--;
           }else if(s1[i].equals("n")&& n[13]>0){
               k=k+"n";
               n[13]--;
           }else if(s1[i].equals("o")&& n[14]>0){
               k=k+"o";
               n[14]--;
           }else if(s1[i].equals("p")&& n[15]>0){
               k=k+"p";
               n[15]--;
           }else if(s1[i].equals("q")&& n[16]>0){
               k=k+"q";
               n[16]--;
           }else if(s1[i].equals("r")&& n[17]>0){
               k=k+"r";
               n[17]--;
           }else if(s1[i].equals("s")&& n[18]>0){
               k=k+"s";
               n[18]--;
           }else if(s1[i].equals("t")&& n[19]>0){
               k=k+"t";
               n[19]--;
           }else if(s1[i].equals("u")&& n[20]>0){
               k=k+"u";
               n[20]--;
           }else if(s1[i].equals("v")&& n[21]>0){
               k=k+"v";
               n[21]--;
           }else if(s1[i].equals("w")&& n[22]>0){
               k=k+"w";
               n[22]--;
           }else if(s1[i].equals("x")&& n[23]>0){
               k=k+"x";
               n[23]--;
           }else if(s1[i].equals("y")&& n[24]>0){
               k=k+"y";
               n[24]--;
           }else if(s1[i].equals("z")&& n[25]>0){
               k=k+"z";
               n[25]--;
           }
       }
        System.out.println(k);
    }
}