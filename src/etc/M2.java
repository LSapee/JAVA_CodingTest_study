package etc;

import java.util.Arrays;

public class M2 {
    public static void main(String[] args) {
        int n =5;
        String s ="";
        int an = -10;
        String a ="";
        String[] plans = {"100 1 3","500 4","2000 5"};
        String ss[][] = new String[plans.length][2];
        String[] clients = {"300 3 5","1500 1","100 1 3","50 1 2"};
        int []answer = new int[clients.length];

        for(int i=0; i<plans.length; ++i){
            String p[] = plans[i].split(" ",2);
            ss[i][0] = p[0];
            s = s+" "+ p[1];
            s = s.trim();
            ss[i][1] = s;
            a = Arrays.toString(ss[i]);
            a = a.replaceAll("\\[","");
            a = a.replaceAll("]","");
            a = a.replaceAll(",","");
            plans[i] = a;
        }
        for(int i=0; i< clients.length; ++i){
            String cl[] = clients[i].split(" ",2);
            int data = Integer.parseInt(cl[0]);
            for(int j=0; j<plans.length; j++){
                String pl[] = plans[j].split(" ",2);
                int d = Integer.parseInt(pl[0]);

                if(d>=data){
                    String f[] = cl[1].split(" ");
                    int m =f.length;
                    int sum =0;
                    for(int o =0; o<m; ++o){
                        if(pl[1].contains(f[o])){
                            ++sum;
                        }
                        if(sum==m){
                            an = j;
                            break;
                        }
                    }
                    if(an==j){
                        break;
                    }else if(j==plans.length-1 && an ==-10){
                        an = -1;
                    }
                }

            }
            answer[i] = an+1;
            an = -10;
        }

    }
}
